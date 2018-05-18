package ru.testsForStudents.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;
import ru.testsForStudents.DAO.UserDAO;
import ru.testsForStudents.entity.User;
import ru.testsForStudents.service.AccountService;

import java.util.List;

@Controller
public class HelloController {

    private final AccountService accountService;
    private User mUser = null;

    // Which is auto-generated by Spring, we will use it to handle the data
    private final UserDAO userDAO;

    @ModelAttribute("user")
    public User getUser(){
        return mUser;
    }

    @Autowired // This means to get the bean called userRepository and accountService
    public HelloController(AccountService accountService, UserDAO userDAO) {
        this.accountService = accountService;
        this.userDAO = userDAO;
    }

    @GetMapping(path="/add") // Map ONLY GET Requests
    public String addNewUser (
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
        mUser = user;
        userDAO.save(user);
        return "redirect:/index";
    }

    @GetMapping(path="/add-test")
    public String addTest(){
        return "add-test";
    }

    @GetMapping(path="/add-new-test")
    public String addNewTest(){
        return "redirect:/administration";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<User> getAllUsers() {
        Iterable<User> iterable = userDAO.findAll();
        return iterable;
    }

    @RequestMapping(value = { "/", "/index" }, method = RequestMethod.GET)
    public ModelAndView helloPage(ModelAndView model) {

        if(mUser != null){
            if(mUser.getStatus() == User.Status.STUDENT)
                return new ModelAndView("redirect:/testing");
            else if(mUser.getStatus() == User.Status.TEACHER)
                return new ModelAndView("redirect:/administration");
        }
        String message = "Hello Spring Boot + JSP";
        model.setViewName("index");
        model.addObject("title", message);
        return model;
    }

    @GetMapping("/registration")
    public String registration(Model model){
        return "registration";
    }

    @GetMapping("/verification")
    public RedirectView verification(RedirectAttributes attributes,
                                     @RequestParam(name = "login") String login,
                                     @RequestParam(name = "password") String password){
        RedirectView redirectView = new RedirectView();
        if(accountService.checkIfContainsUser(login, password)){
            User user = accountService.getUserByLogin(login);
            mUser = user;
            if(user.getStatus() == User.Status.STUDENT) {
                //attributes.addAttribute("user_id", user.getId());
                redirectView.setUrl("testing");
            }else if(user.getStatus() == User.Status.TEACHER) {
                //attributes.addAttribute("user_id", user.getId());
                redirectView.setUrl("administration");
            }else
                redirectView.setUrl("errorAccess");
        } else
            redirectView.setUrl("registration");
        return redirectView;
    }

    @GetMapping("/testing")
    public String testing(@ModelAttribute("user") User user, Model model){
        model.addAttribute("login", user.getLogin());
        return "testing";
    }

    @GetMapping("/administration")
    public String administration(@ModelAttribute("user") User user, Model model){
        model.addAttribute("login", user.getLogin());
        model.addAttribute("status", user.getStatus() == User.Status.STUDENT ? "student" : "teacher");
        return "administration";
    }

    @GetMapping("/administration-table")
    public String administrationTable(@ModelAttribute("user") User user, Model model){
        model.addAttribute("login", user.getLogin());
        List<User> usersList = userDAO.findUsersByStatus(User.Status.STUDENT);
        model.addAttribute("studentList", usersList);
        return "administration-table";
    }

    @GetMapping("/exit")
    public String exit(@ModelAttribute("user") User user){
        mUser = null;
        return "index";
    }
}