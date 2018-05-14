package ru.testsForStudents.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Base class with property Id
 */

@MappedSuperclass
public abstract class BaseEntity implements Serializable {

    protected Long id;
}
