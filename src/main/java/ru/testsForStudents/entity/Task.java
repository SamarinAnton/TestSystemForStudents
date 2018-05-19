package ru.testsForStudents.entity;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "tasks", schema = "TestSystem")
public class Task extends BaseEntity {
    private String options;
    private String answer;
    private String condition;
    private Lesson lesson;

    @Basic
    @Column(name = "options", nullable = false)
    public String getOptions() {
        return options;
    }

    public void setOptions(String options) {
        this.options = options;
    }

    @Basic
    @Column(name = "answer", nullable = false)
    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Basic
    @Column(name = "condition", nullable = false)
    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    @ManyToOne
    @JoinColumn(name = "lessons_id", referencedColumnName = "id", nullable = false)
    public Lesson getLesson() {
        return lesson;
    }

    public void setLesson(Lesson lesson) {
        this.lesson = lesson;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", condition='" + condition + '\'' +
                ", options=" + options +
                ", answer=" + answer +
                ", lessons=" + lesson +
                '}';
    }
}
