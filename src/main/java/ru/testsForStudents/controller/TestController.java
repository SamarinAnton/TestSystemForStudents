package ru.testsForStudents.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.testsForStudents.DAO.LessonDAO;
import ru.testsForStudents.DAO.TaskDAO;
import ru.testsForStudents.entity.Lesson;
import ru.testsForStudents.entity.Task;
import ru.testsForStudents.entity.User;

@Controller
@RequestMapping("/tasks")
@SessionAttributes(value = "user")
public class TestController {
    @Autowired
    private LessonDAO lessonDAO;

    @Autowired
    private TaskDAO taskDAO;


    @GetMapping(path="/new-test")
    public String addTest(){
        return "add-test";
    }

    @GetMapping(path="/add-new-test")
    public String addNewTest(@RequestParam String subject,
                             @RequestParam String condition,
                             @RequestParam String answer,
                             @RequestParam String option,
                             @ModelAttribute("user") User userModel){
        Lesson lesson = new Lesson();
        lesson.setSubject(subject);
        Task task = new Task();
        task.setLesson(lesson);
        task.setCondition(condition);
        task.setAnswer(answer);
        task.setOptions(option);
        lesson = lessonDAO.save(lesson);
        System.out.println(">> " + lesson.getId());
        lessonDAO.findById(lesson.getId()).map(les -> {
            task.setLesson(les);
            return taskDAO.save(task);
        });
        return "redirect:/administration";
    }

    @GetMapping("/testing")
    public String testing(@ModelAttribute("user") User user, Model model){
        model.addAttribute("login", user.getLogin());
        return "testing";
    }
}
