package com.example.it526.entity;

import jakarta.persistence.*;

import java.util.Date;


@Entity
@Table(name = "DEP_EMPLOYEE")
public class Employee {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "employee_seq")
    @SequenceGenerator(name="employee_seq", sequenceName = "EMPLOYEE_SEQ", allocationSize =1)
    private Long employeeeId;

    @Column(length = 100, nullable = false, unique = true)
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String address;
    private Date dateOfBirth ;

    @Lob
    private String remarks ;
    @Transient
    private Long age ;

    @ManyToMany
    @JoinColumn(
            name = "department_id",
            foreignKey = @ForeignKey(name = "FK_EMPLOYEE_DEPARTMENT")
    )
    private Department department ;

    public Employee() {}

    public Employee(Long employeeeId,
                    String firstName,
                    String lastName,
                    String email,
                    String phone,
                    String address) {
        this.employeeeId = employeeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }
}
