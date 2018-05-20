package ru.testsForStudents.DTO;

import ru.testsForStudents.entity.User;

import java.util.Objects;

public class UserDTO extends BaseDTO<User> {
    private String login;
    private String password;
    private User.Status status;

    public UserDTO() {
    }

    public UserDTO(String login) {
        this.login = login;
    }

    public UserDTO(User entity) {
        this.id = entity.getId();
        this.login = entity.getLogin();
        this.password = entity.getPassword();
        this.status = entity.getStatus();
    }

    @Override
    public void apply(User entity) {
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User.Status getStatus() {
        return status;
    }

    public void setStatus(User.Status status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserDTO userDTO = (UserDTO) o;
        return id == userDTO.id &&
                Objects.equals(login, userDTO.login) &&
                Objects.equals(password, userDTO.password) &&
                status.equals(userDTO.status);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, login, password, status);
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", status=" + status +
                '}';
    }
}
