package ru.testsForStudents;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.testsForStudents.DAO.UserDAO;
import ru.testsForStudents.entity.User;

@Controller    // This means that this class is a Controller
@RequestMapping(path="/demo") // This means URL's start with /demo (after Application path)
public class Main {
    @Autowired // This means to get the bean called userRepository
    // Which is auto-generated by Spring, we will use it to handle the data
    private UserDAO userDAO;

    @GetMapping(path="/add") // Map ONLY GET Requests
    public @ResponseBody String addNewUser (
            @RequestParam String name,
            @RequestParam String surname,
            @RequestParam String group,
            @RequestParam String groupUser,
            @RequestParam String login,
            @RequestParam String password) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request

        User user = new User();
        user.setLogin(login);
        user.setPassword(password);
        if(groupUser.equalsIgnoreCase("teacher")){
            user.setStatus(User.Status.TEACHER);
        } else {
            user.setStatus(User.Status.STUDENT);
        }
        userDAO.save(user);
        return "Saved";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<User> getAllUsers() {
        Iterable<User> iterable = userDAO.findAll();
        return iterable;
    }
}
