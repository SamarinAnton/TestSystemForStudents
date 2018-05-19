package ru.testsForStudents.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.testsForStudents.entity.User;

@Controller
@RequestMapping("/tasks")
@SessionAttributes(value = "user")
public class TestController {


    @GetMapping(path="/new-test")
    public String addTest(){
        return "add-test";
    }

    @GetMapping(path="/add-new-test")
    public String addNewTest(){
        return "redirect:/administration";
    }

    @GetMapping("/testing")
    public String testing(@ModelAttribute("user") User user, Model model){
        model.addAttribute("login", user.getLogin());
        return "testing";
    }
}
