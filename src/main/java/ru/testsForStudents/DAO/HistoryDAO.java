package ru.testsForStudents.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.testsForStudents.entity.History;
import ru.testsForStudents.entity.Lesson;
import ru.testsForStudents.entity.Student;

import java.util.List;

public interface HistoryDAO extends JpaRepository<History, Long> {
    List<History> findAllByLessonAndStudent(Lesson lesson, Student student);
    List<History> findAllByLesson(Lesson lesson);
}
