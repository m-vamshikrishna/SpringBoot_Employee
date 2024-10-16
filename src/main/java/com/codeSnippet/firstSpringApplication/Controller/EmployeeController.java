package com.codeSnippet.firstSpringApplication.Controller;

import com.codeSnippet.firstSpringApplication.Service.EmployeeService;
import com.codeSnippet.firstSpringApplication.dto.EmployeeDto;
import com.codeSnippet.firstSpringApplication.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    @GetMapping("/getEmployee/{id}")
    public ResponseEntity<EmployeeDto> getEmployee(@PathVariable Integer id)
    {
        return ResponseEntity.ok(employeeService.getEmployee(id));
    }

}
