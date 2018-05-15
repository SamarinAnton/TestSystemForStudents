package ru.testsForStudents.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.ModelMap;

@Controller
public class HelloController {

    @RequestMapping(value = { "/", "/index" }, method = RequestMethod.GET)
    public String helloPage(Model model) {

        String message = "Hello Spring Boot + JSP";

        model.addAttribute("title", message);

        return "index";
    }

    @GetMapping("/registration")
    public String registration(Model model){
        return "registration";
    }
}