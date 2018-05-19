package ru.testsForStudents.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "teachers", schema = "TestSystem")
public class Teacher extends UserModel {
//    private long id;
//    private String firstName;
//    private String lastName;
//    private User user;
//
//    @Id
//    @Column(name = "id", nullable = false)
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    public long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }
//
//
//    @Basic
//    @Column(name = "first_name", nullable = false, length = 45)
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//
//    @Basic
//    @Column(name = "last_name", nullable = false, length = 45)
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    @OneToOne
//    @JoinColumn(name = "users_id", referencedColumnName = "id", nullable = false)
//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }
//
    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", first name='" + firstName + '\'' +
                ", last name=" + lastName +
                ", user=" + user +
                '}';
    }
}
