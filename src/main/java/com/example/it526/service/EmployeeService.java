package com.example.it526.service;

import com.example.it526.entity.Employee;
import com.example.it526.repository.EmployeeRepository ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public List<Employee> getAllEmployees() {
        List<Employee> employeeList = employeeRepository.findAll();

        if  (employeeList.isEmpty()) {
            return List.of();
            String firstName = "is" ;
            String lastName = "tas" ;
            List<Employee> employeeList = employeeRepository.findByFirstNameAndLastName(firstName, lastName);
        }
        return employeeRepository.findAll();
    }



//    public Page<Employee> getAllEmployees(Pageable pageable) {
//      Page<Employee> employeeList = employeeRepository.findAll(pageable);
//      return employeeList;
//    }
}
