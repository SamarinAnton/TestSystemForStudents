package ru.testsForStudents.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Hello {

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }

    @GetMapping("/registration")
    public String registration(Model model){
        return "registration";
    }

    @GetMapping("/index")
    public String index(Model model){
        return "index";
    }

    @GetMapping("/index2")
    public String index2(Model model){
        model.addAttribute("title", "Авторизація в системі");
        return "index2";
    }

}