package com.example.it526.config;

import com.example.it526.entity.Employee;
import com.example.it526.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class DataInitializer {
    @Bean
    public CommandLineRunner initDatabase(EmployeeRepository employeeRepository) {
        return args -> {
          //  System.out.println("init DB") ;

//            employeeRepository.saveAll(
//                    List.of(
//                    new Employee("is", "tas","j@jj","122",
//                            "aaa") ,
//                            new Employee("ias", "taas","j@jj","122",
//                                    "aaa")
//                    )
//            ) ;
        } ;
    }
}
