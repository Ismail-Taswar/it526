package com.example.it526.repository;

import com.example.it526.entity.Department;
import com.example.it526.entity.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.ListIterator;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    Page<Employee> findAll(Pageable pageable);

        List<Employee> findByFirstName(String firstName);
        List<Employee> findAll() ;
        List<Employee> findByFirstNameAndLastName(String firstName, String lastName);
}
