package ru.testsForStudents.DTO;

import ru.testsForStudents.entity.BaseEntity;

import java.io.Serializable;

public abstract class BaseDTO<E extends BaseEntity> implements Serializable {
    protected long id;

    public abstract void apply(E entity);

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
