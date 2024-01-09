package com.springboot.validation.springvalidation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.validation.springvalidation.entity.Employee;
import com.springboot.validation.springvalidation.repository.EmployeeRepository;



@Service
public class EmployeeService {
    
    @Autowired
    private EmployeeRepository employeeRepository;

    public void saveEmployeeData(Employee employee){
         employeeRepository.save(employee);;
    }
}
