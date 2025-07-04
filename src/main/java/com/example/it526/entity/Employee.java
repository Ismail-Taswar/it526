package com.example.it526.entity;

import jakarta.persistence.*;

import java.util.Date;


@Entity
@Table(name = "DEP_EMPLOYEE")
public class Employee {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "employee_seq")
    @SequenceGenerator(name="employee_seq", sequenceName = "EMPLOYEE_SEQ", allocationSize =1)
    private Long employeeId;

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

    @ManyToOne
    @JoinColumn(
            name = "department_id",
            foreignKey = @ForeignKey(name = "FK_EMPLOYEE_DEPARTMENT")
    )
    private Department department ;

    public Employee() {}

    public Employee(String firstName,
                    String lastName,
                    String email,
                    String phone,
                    String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }
    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long id) {
        this.employeeId = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

}
