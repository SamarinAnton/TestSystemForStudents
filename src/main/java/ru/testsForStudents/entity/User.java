package ru.testsForStudents.entity;

import ru.testsForStudents.UserModel;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "users", schema = "TestSystem")
public class User implements Serializable{

    public enum Status {STUDENT, TEACHER}

    private String login;
    private String password;
    private Status status;
    private Long id;



    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL,
    fetch = FetchType.LAZY, optional = false)
    private Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        if(student == null){
            if(this.student != null){
                this.student.setUser(null);
            }
        } else
            student.setUser(this);
        this.student = student;
    }

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL,
            fetch = FetchType.LAZY, optional = false)
    private Teacher teacher;

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

/*    @Column(name = "st_user_id", nullable = false, insertable = false, updatable = false)
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }*/


    /*@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private Teacher teacher;

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }*/

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
                '}';
    }
}
