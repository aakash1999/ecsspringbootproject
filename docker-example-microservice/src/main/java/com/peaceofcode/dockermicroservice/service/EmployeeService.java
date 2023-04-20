package com.peaceofcode.dockermicroservice.service;

import com.peaceofcode.dockermicroservice.dto.EmployeeDto;

public interface EmployeeService {

    EmployeeDto getEmployee(Long id);
}
