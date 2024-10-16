package com.codeSnippet.firstSpringApplication.Service;

import com.codeSnippet.firstSpringApplication.Repository.EmployeeRepository;
import com.codeSnippet.firstSpringApplication.dto.EmployeeDto;
import com.codeSnippet.firstSpringApplication.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;
    public EmployeeDto getEmployee(Integer id)
    {
        Employee employee = employeeRepository.getEmployee(id);
        EmployeeDto employeeDto = new EmployeeDto();
        return employeeDto.EmployeeMapper(employee);
    }
}
