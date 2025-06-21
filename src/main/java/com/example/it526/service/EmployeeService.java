package com.example.it526.service;

import com.example.it526.entity.Employee;
//import com.example.it526.repository.EmployeeRepository ;
import com.example.it526.repository.EmployeeRepository ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Long insertEmployee(Employee employee) {
        Employee newEmployee = employeeRepository.save(employee);
        return newEmployee.getEmployeeId();
    }
}
