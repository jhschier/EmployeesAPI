package com.northwind_api.rest_api.controller;

import java.util.NoSuchElementException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.northwind_api.rest_api.database.EmployeeRepository;
import com.northwind_api.rest_api.model.Employee;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RequestMapping(value = "/api/v1", produces = { "application/json" })
@RestController
@Tag(name = "Employees")
public class EmployeeController {
    private final EmployeeRepository employeeRepository;

    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Operation(summary = "Endpoint responsavel por buscar um colaborador por Id")
    @GetMapping("employee/{employeeId}")
    public Employee getEmployeeInfo(@PathVariable Integer employeeId) {
        Employee employeeInfo = employeeRepository.findById(employeeId)
                .orElseThrow(() -> new NoSuchElementException("Employee with the id " + employeeId + " not found."));
        return employeeInfo;
    }
}
