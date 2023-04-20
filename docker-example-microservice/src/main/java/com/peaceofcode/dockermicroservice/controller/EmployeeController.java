package com.peaceofcode.dockermicroservice.controller;

import com.peaceofcode.dockermicroservice.dto.EmployeeDto;
import com.peaceofcode.dockermicroservice.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/employees")
@AllArgsConstructor
public class EmployeeController {

    private EmployeeService employeeService;

    @GetMapping("{emp-id}")
    public ResponseEntity<EmployeeDto> getEmployee(@PathVariable("emp-id") Long id){
        return ResponseEntity.ok(employeeService.getEmployee(id));
    }


}
