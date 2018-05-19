package ru.testsForStudents.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.testsForStudents.entity.History;

public interface HistoryDAO extends JpaRepository<History, Long>{
}
