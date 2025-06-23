package com.example.it526.controller;

import com.example.it526.dto.EmployeeDto;
import com.example.it526.entity.Employee;
import com.example.it526.service.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping(path = "/employees")

public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    private Page<Employee> getEmployees(
            Pageable pageable
    ) {
        Page<Employee> employeeList = employeeService.getAllEmployees(pageable) ;

        return employeeList;

//        return employeeService.getAllEmployees();
//        return List.of(
//                new EmployeeDto(1L, "Meftaul", "Haque"),
//                new EmployeeDto(2L, "John", "Doe"),
//                new EmployeeDto(3L, "Jane", "Smith")
//        );
//       List<Employee> employeeList = employeeService.getAllEmployees() ;
//       if (employeeList.isEmpty()) {
//           return List.of();
//           return employeeList ;
       }
    }

    @GetMapping("/{employeeId}")
    private ResponseEntity<EmployeeDto> getEmployeeById(@PathVariable(name = "employeeId") Long empId) {
        // return employeeService.getEmployeeById(empId);
        EmployeeDto employee = new EmployeeDto(empId, "Sample", "Employee");

        if (Objects.isNull(employee)) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.status(HttpStatus.OK).body(employee);
    }

    @PostMapping
    private Long insertEmployee(@Valid @RequestBody EmployeeDto employeeDto) {
        // Convert EmployeeDto to Employee entity if needed
        // Employee employee = new Employee(employeeDto.getEmployeeId(), employeeDto.getFirstName(), employeeDto.getLastName());
        // return employeeService.insertEmployee(employee);
        return 1L; // Simulating insertion and returning the new employee ID
    }

}
