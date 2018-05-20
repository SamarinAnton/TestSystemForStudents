package ru.testsForStudents.DTO;

import ru.testsForStudents.entity.Lesson;
import ru.testsForStudents.entity.Task;

import java.util.Objects;

public class TaskDTO extends BaseDTO<Task> {
    private String options;
    private String answer;
    private String condition;
    private LessonDTO lessonDTO;

    public TaskDTO() {
    }

    //may be needed more constructors
    public TaskDTO(String condition, String answer, String options) {
        this.condition = condition;
        this.answer = answer;
        this.options = options;
    }

    public TaskDTO(Task entity) {
        this.id = entity.getId();
        this.options = entity.getOptions();
        this.answer = entity.getAnswer();
        this.condition = entity.getCondition();
        this.lessonDTO = null;
    }

    public String getOptions() {
        return options;
    }

    public void setOptions(String options) {
        this.options = options;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public LessonDTO getLessonDTO() {
        return lessonDTO;
    }

    public void setLessonDTO(LessonDTO lessonDTO) {
        this.lessonDTO = lessonDTO;
    }

    @Override
    public void apply(Task entity) {
        this.lessonDTO = new LessonDTO(entity.getLesson());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TaskDTO taskDTO = (TaskDTO) o;
        return id == taskDTO.id &&
                Objects.equals(condition, taskDTO.condition) &&
                Objects.equals(options, taskDTO.options) &&
                taskDTO.lessonDTO.equals(lessonDTO) &&
                Objects.equals(answer, taskDTO.answer);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, condition, options, answer, lessonDTO);
    }

    @Override
    public String toString() {
        return "TaskDTO{" +
                "id=" + id +
                ", condition='" + condition + '\'' +
                ", options=" + options +
                ", answer=" + answer +
                ", lessonsDTO=" + lessonDTO +
                '}';
    }
}
