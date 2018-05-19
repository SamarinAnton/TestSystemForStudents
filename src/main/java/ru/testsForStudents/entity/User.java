package ru.testsForStudents.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "users", schema = "TestSystem")
public class User extends BaseEntity{

    public enum Status {STUDENT, TEACHER}

//    private long id;
    private String login;
    private String password;
    private Status status;

    private Student student;    // may be not need
    private Teacher teacher;    // may be not need



    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "users_id")
    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        if (student == null) {
            if (this.student != null) {
                this.student.setUser(null);
            }
        } else
            student.setUser(this);
        this.student = student;
    }

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "users_id")
    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        if(teacher == null){
            if(this.teacher != null){
                this.teacher.setUser(null);
            }
        } else
            teacher.setUser(this);
        this.teacher = teacher;
    }

    @Basic
    @Column(name = "login", nullable = false, unique = true)
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Basic
    @Column(name = "password", nullable = false)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "status", nullable = false)
    @Enumerated(EnumType.STRING)
    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password=" + password +
                ", status=" + status +
                ", student=" + student +
                ", teacher=" + teacher +
                '}';
    }
}
