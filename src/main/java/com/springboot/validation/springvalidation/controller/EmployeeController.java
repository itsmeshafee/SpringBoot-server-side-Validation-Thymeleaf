package com.springboot.validation.springvalidation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.springboot.validation.springvalidation.entity.Employee;
import com.springboot.validation.springvalidation.service.EmployeeService;

import jakarta.validation.Valid;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public String saveEmployee(Model model)
    {
        model.addAttribute("employee", new Employee());
        return "employee_form";
    }

    @PostMapping("/submit")
    public String submitEmployee(@Valid @ModelAttribute("employee") Employee employee, BindingResult bindingResult)
    {
        if (bindingResult.hasErrors()){
            System.out.println(bindingResult);
            return "employee_form";
        }
        employeeService.saveEmployeeData(employee);
        return "submit_employee";
    }
    
}
