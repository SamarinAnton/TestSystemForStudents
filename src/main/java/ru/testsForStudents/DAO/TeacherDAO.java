package ru.testsForStudents.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import ru.testsForStudents.entity.Teacher;

public interface TeacherDAO extends JpaRepository<Teacher, Long> {
}
