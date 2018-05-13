package ru.testsForStudents.DAO;

import org.springframework.data.repository.CrudRepository;
import ru.testsForStudents.entity.User;

import java.util.List;

public interface UserDAO extends CrudRepository<User, Long>{
}