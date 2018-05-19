package ru.testsForStudents.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.testsForStudents.entity.Task;

public interface TaskDAO extends JpaRepository<Task, Long>{
}
