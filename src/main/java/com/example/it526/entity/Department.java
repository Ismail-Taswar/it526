package com.example.it526.entity;

import jakarta.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "dept_seq")
    @SequenceGenerator(name="dept_seq", sequenceName = "DEPT_SEQ", allocationSize = 1)
    private Long departmentId;

    @OneToMany(
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "department"
    )
    private Set<Employee> employees;

}
