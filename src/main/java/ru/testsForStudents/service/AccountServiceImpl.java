package ru.testsForStudents.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.testsForStudents.DAO.UserDAO;
import ru.testsForStudents.entity.Student;
import ru.testsForStudents.entity.Teacher;
import ru.testsForStudents.entity.User;

import java.util.Optional;

@Service
public class AccountServiceImpl implements AccountService{

    @Autowired
    private UserDAO userRepository;
    @Override
    public User getUserById(long id) {
        Optional<User> userOptional = userRepository.findById(id);
        if(userOptional.isPresent())
            return userRepository.findById(id).get();
        else
            return null;
    }

    @Override
    public Student getStudentByUser(User user) {
        return null;
    }

    @Override
    public Teacher getTeacherByUser(User user) {
        return null;
    }

    @Override
    public boolean checkIfContainsUser(String login, String password) {
        User user = userRepository.findUserByLogin(login);
        return user != null && user.getPassword().equals(password);
    }

    public User getUserByLogin(String login){
        return userRepository.findUserByLogin(login);
    }
}
