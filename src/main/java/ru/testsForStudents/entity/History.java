package ru.testsForStudents.entity;

import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "history", schema = "TestSystem")
public class History extends BaseEntity {
    private Date lastUpdate;
    private int right;
    private int all;

    private Lesson lesson;
    private Student student;


    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "time", nullable = false)
    @LastModifiedDate
    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }


    @Basic
    @Column(name = "right", nullable = false)
    public int getRight() {
        return right;
    }

    public void setRight(int right) {
        this.right = right;
    }


    @Basic
    @Column(name = "all", nullable = false)
    public int getAll() {
        return all;
    }

    public void setAll(int all) {
        this.all = all;
    }

    @ManyToOne
    @JoinColumn(name = "lessons_id", referencedColumnName = "id", nullable = false)
    public Lesson getLesson() {
        return lesson;
    }

    public void setLesson(Lesson lesson) {
        this.lesson = lesson;
    }


    @ManyToOne
    @JoinColumn(name = "users_id", referencedColumnName = "id", nullable = false)
    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "History{" +
                "id=" + id +
                ", right='" + right + '\'' +
                ", all=" + all +
                ", last update=" + lastUpdate +
                ", lessons=" + lesson +
                ", Student=" + student +
                '}';
    }
}
