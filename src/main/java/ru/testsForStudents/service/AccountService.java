package ru.testsForStudents.service;

import ru.testsForStudents.entity.Student;
import ru.testsForStudents.entity.Teacher;
import ru.testsForStudents.entity.User;

public interface AccountService {
    User getUserById(long id);
    Student getStudentByUser(User user);
    Teacher getTeacherByUser(User user);
    boolean checkIfContainsUser(String login, String password);
    User getUserByLogin(String login);
}
