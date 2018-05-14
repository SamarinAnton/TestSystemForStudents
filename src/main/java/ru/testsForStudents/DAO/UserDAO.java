package ru.testsForStudents.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import ru.testsForStudents.entity.BaseEntity;
import ru.testsForStudents.entity.User;

import java.util.List;

public interface UserDAO extends JpaRepository<User, Long> {
}