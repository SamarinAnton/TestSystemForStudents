package ru.testsForStudents.DTO;

import ru.testsForStudents.entity.Lesson;
import ru.testsForStudents.entity.User;

import java.util.Objects;

public class LessonDTO extends BaseDTO<Lesson> {
    private String subject;

    public LessonDTO() {
    }

    public LessonDTO(String subject) {
        this.subject = subject;
    }

    public LessonDTO(Lesson entity) {
        this.id = entity.getId();
        this.subject = entity.getSubject();
    }

    @Override
    public void apply(Lesson entity) {
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LessonDTO lessonDTO = (LessonDTO) o;
        return id == lessonDTO.id &&
                Objects.equals(subject, lessonDTO.subject);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, subject);
    }

    @Override
    public String toString() {
        return "LessonDTO{" +
                "id=" + id +
                ", subject='" + subject + '\'' +
                '}';
    }
}
