package com.springboot.validation.springvalidation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.validation.springvalidation.entity.Employee;



public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    
}