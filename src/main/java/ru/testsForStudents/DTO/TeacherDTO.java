package ru.testsForStudents.DTO;

import ru.testsForStudents.entity.Teacher;
import ru.testsForStudents.entity.User;

import java.util.Objects;

public class TeacherDTO extends UserModelDTO<Teacher> {

    public TeacherDTO() {
    }

    public TeacherDTO(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public TeacherDTO(Teacher entity) {
        super(entity);
    }

//    @Override
//    public void apply(Teacher entity) {
//        this.userDTO = new UserDTO(entity.getUser());
//    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        TeacherDTO teacherDTO = (TeacherDTO) o;
//        return id == teacherDTO.id &&
//                Objects.equals(firstName, teacherDTO.firstName) &&
//                Objects.equals(lastName, teacherDTO.lastName) &&
//                teacherDTO.userDTO.equals(userDTO);
//    }
//
//    @Override
//    public int hashCode() {
//
//        return Objects.hash(id, firstName, lastName, userDTO);
//    }

    @Override
    public String toString() {
        return "TeacherDTO{" +
                "id=" + id +
                ", first name='" + firstName + '\'' +
                ", last name=" + lastName +
                ", userDTO=" + userDTO +
                '}';
    }
}