package ru.testsForStudents.DTO;

import ru.testsForStudents.entity.History;

import java.sql.Timestamp;
import java.util.Objects;

public class HistoryDTO extends BaseDTO<History> {
    private Timestamp lastUpdate;
    private int right;
    private int all;

    private LessonDTO lessonDTO;
    private StudentDTO studentDTO;

    public HistoryDTO() {
    }

    //may be needed more constructors
    public HistoryDTO(int right, int all) {
        this.right = right;
        this.all = all;
    }

    public HistoryDTO(History entity) {
        this.id = entity.getId();
        this.lastUpdate = entity.getLastUpdate();
        this.right = entity.getRight();
        this.all = entity.getAll();
        this.lessonDTO = null;
        this.studentDTO = null;
    }

    public Timestamp getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public int getRight() {
        return right;
    }

    public void setRight(int right) {
        this.right = right;
    }

    public int getAll() {
        return all;
    }

    public void setAll(int all) {
        this.all = all;
    }

    public LessonDTO getLesson() {
        return lessonDTO;
    }

    public void setLesson(LessonDTO lessonDTO) {
        this.lessonDTO = lessonDTO;
    }

    public StudentDTO getStudent() {
        return studentDTO;
    }

    public void setStudent(StudentDTO studentDTO) {
        this.studentDTO = studentDTO;
    }

    @Override
    public void apply(History entity) {
        this.studentDTO = new StudentDTO(entity.getStudent());
        this.lessonDTO = new LessonDTO(entity.getLesson());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HistoryDTO historyDTO = (HistoryDTO) o;
        return id == historyDTO.id &&
                right == historyDTO.right &&
                all == historyDTO.all &&
                Objects.equals(lastUpdate, historyDTO.lastUpdate) &&
                historyDTO.lessonDTO.equals(lessonDTO) &&
                historyDTO.studentDTO.equals(studentDTO);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, right, all, lastUpdate, lessonDTO, studentDTO);
    }

    @Override
    public String toString() {
        return "HistoryDTO{" +
                "id=" + id +
                ", right='" + right + '\'' +
                ", all=" + all +
                ", last update=" + lastUpdate +
                ", lessonsDTO=" + lessonDTO +
                ", StudentDTO=" + studentDTO +
                '}';
    }
}
