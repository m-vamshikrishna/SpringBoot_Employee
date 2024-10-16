package com.codeSnippet.firstSpringApplication.Repository;

import com.codeSnippet.firstSpringApplication.entity.Employee;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepository {
    public Employee getEmployee(Integer id)
    {
        return new Employee(1,"Vamshi","GS",23);
    }
}
