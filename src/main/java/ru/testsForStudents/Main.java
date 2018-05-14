package ru.testsForStudents;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.testsForStudents.DAO.UserDAO;
import ru.testsForStudents.entity.BaseEntity;
import ru.testsForStudents.entity.Student;
import ru.testsForStudents.entity.User;

@Controller
@RequestMapping(path="/demo")
public class Main {
    @Autowired
    private UserDAO userDAO;
//
//    @GetMapping(path="/add")
//    public @ResponseBody String addNewUser (
//            @RequestParam String name,
//            @RequestParam String surname,
//            @RequestParam String group,
//            @RequestParam String groupUser,
//            @RequestParam String login,
//            @RequestParam String password) {
//
//        BaseEntity baseEntity;
//        User user = new User();
//        user.setLogin(login);
//        user.setPassword(password);
//        if(groupUser.equalsIgnoreCase("teacher")){
//            user.setStatus(User.Status.TEACHER);
//            baseEntity = user;
//        } else {
//            user.setStatus(User.Status.STUDENT);
//            Student student = new Student();
//            student.setUser(user);
//            student.setFirstName(name);
//            student.setLastName(surname);
//            student.setUserId(user.getId());
//            baseEntity = student;
//        }
//        userDAO.save(baseEntity);
//        return "Saved";
//    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<User> getAllUsers() {
        return userDAO.findAll();
    }
}
