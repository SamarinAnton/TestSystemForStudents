package ru.testsForStudents.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import ru.testsForStudents.entity.Student;

public interface StudentDAO extends JpaRepository<Student, Long> {
}
