package ru.testsForStudents.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "users", schema = "TestSystem")
public class Student extends BaseEntity implements Serializable{
    private User user;
    private long userId;
    private String firstName;
    private String lastName;

    @Basic
    @Column(name = "users_id", nullable = false, unique = true)
    public long getUserId(){
        return userId;
    }

    public void setUserId(long userId){
        this.userId = userId;
    }

    @Basic
    @Column(name = "first_name", nullable = false)
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Basic
    @Column(name = "last_name", nullable = false)
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "user=" + user +
                ", id=" + id +
                ", userId=" + userId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
