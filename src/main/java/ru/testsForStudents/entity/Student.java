package ru.testsForStudents.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "students", schema = "TestSystem")
public class Student extends UserModel{
//    private User user;
//    private long id;
//    private String firstName;
//    private String lastName;

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id", nullable = false)
//    public long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }
//
//    @Basic
//    @Column(name = "first_name", nullable = false)
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    @Basic
//    @Column(name = "last_name", nullable = false)
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

    /*@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    @JoinColumn(name = "users_id")
    private Set<History> histories;

    public Set<History> getHistories() {
        return histories;
    }

    public void setHistories(Set<History> histories) {
        this.histories = histories;
    }
*/
    @Override
    public String toString() {
        return "Student{" +
                ", id=" + id +
                ", first name='" + firstName + '\'' +
                ", last name='" + lastName + '\'' +
                "user=" + user +
                '}';
    }
}
