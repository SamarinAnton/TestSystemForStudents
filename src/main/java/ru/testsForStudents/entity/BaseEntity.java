package ru.testsForStudents.entity;

import javax.persistence.*;

/**
 * Base class with property Id
 */

@MappedSuperclass
public abstract class BaseEntity {

    protected Long id;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
