package ru.testsForStudents.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Base class with property Id
 */

@MappedSuperclass
public abstract class BaseEntity implements Serializable {

    protected long id;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
