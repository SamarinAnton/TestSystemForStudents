package ru.testsForStudents.DAO;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import ru.testsForStudents.entity.Lesson;
import ru.testsForStudents.entity.Task;

import java.util.List;

public interface TaskDAO extends JpaRepository<Task, Long> {
    //Page<Task> findByLesson(Long lessonsId, Pageable pageable);
    List<Task> findByLesson(Lesson lesson);
}