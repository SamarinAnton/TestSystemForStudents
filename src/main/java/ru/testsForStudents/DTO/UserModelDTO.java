package ru.testsForStudents.DTO;

import ru.testsForStudents.entity.Student;
import ru.testsForStudents.entity.User;
import ru.testsForStudents.entity.UserModel;

import java.util.Objects;


public abstract class UserModelDTO<E extends UserModel> extends BaseDTO<E> {

    protected String firstName;
    protected UserDTO userDTO;
    protected String lastName;

    protected UserModelDTO() {
    }

    protected UserModelDTO(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    protected UserModelDTO(E entity) {
        this.id = entity.getId();
        this.firstName = entity.getFirstName();
        this.lastName = entity.getLastName();
        this.userDTO = null;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public UserDTO getUser() {
        return userDTO;
    }

    public void setUser(UserDTO userDTO) {
        this.userDTO = userDTO;
    }

    @Override
    public void apply(E entity) {
        this.userDTO = new UserDTO(entity.getUser());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserModelDTO<?> userModelDTO = (UserModelDTO<?>) o;
        return id == userModelDTO.id &&
                Objects.equals(firstName, userModelDTO.firstName) &&
                Objects.equals(lastName, userModelDTO.lastName) &&
                userModelDTO.userDTO.equals(userDTO);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, firstName, lastName, userDTO);
    }
}
