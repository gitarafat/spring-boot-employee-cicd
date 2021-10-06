package com.springboot.employee.springbootemployeecicd.controller;

import com.springboot.employee.springbootemployeecicd.enitiry.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @GetMapping("/getAllEmployees")
    public List<Employee> getAllEmployees(){
        System.out.println("I am in Controller getAllEmployees");
        return Arrays.asList(new Employee("Mohamed", "78348"), new Employee("Yasir", "90900"));
    }
}
