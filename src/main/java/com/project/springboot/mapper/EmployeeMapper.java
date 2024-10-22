package com.project.springboot.mapper;

import com.project.springboot.dto.EmployeeDto;
import com.project.springboot.entity.Employee;

public class EmployeeMapper {

    public static EmployeeDto mapToEmployeeDTO(Employee employee) {
        return new EmployeeDto(
                employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmail()
        );
    }

    public static Employee mapToEmployee(EmployeeDto employeeDto) {
        return new Employee(
                employeeDto.getId(),
                employeeDto.getFirstName(),
                employeeDto.getLastName(),
                employeeDto.getEmail()
        );
    }
}
