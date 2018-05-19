package ru.testsForStudents.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.testsForStudents.entity.Lesson;

public interface LessonDAO extends JpaRepository<Lesson, Long> {
}
