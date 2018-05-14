package ru.testsForStudents.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "users", schema = "TestSystem")
public class User extends BaseEntity implements Serializable{

    public enum Status {STUDENT, TEACHER}

    private String login;
    private String password;
    private Status status;

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
