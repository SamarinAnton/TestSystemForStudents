package ru.testsForStudents.DTO;

import ru.testsForStudents.entity.Student;

import java.util.Objects;

public class StudentDTO extends UserModelDTO<Student> {
    public StudentDTO() {
    }

    public StudentDTO(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public StudentDTO(Student entity) {
        super(entity);
    }

//    @Override
//    public void apply(Student entity) {
//        this.userDTO = new UserDTO(entity.getUser());
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        StudentDTO studentDTO = (StudentDTO) o;
//        return id == studentDTO.id &&
//                Objects.equals(firstName, studentDTO.firstName) &&
//                Objects.equals(lastName, studentDTO.lastName) &&
//                studentDTO.userDTO.equals(userDTO);
//    }
//
//    @Override
//    public int hashCode() {
//
//        return Objects.hash(id, firstName, lastName, userDTO);
//    }

    @Override
    public String toString() {
        return "StudentDTO{" +
                "id=" + id +
                ", first name='" + firstName + '\'' +
                ", last name=" + lastName +
                ", userDTO=" + userDTO +
                '}';
    }
}
