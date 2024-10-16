package com.codeSnippet.firstSpringApplication.dto;

import com.codeSnippet.firstSpringApplication.entity.Employee;

public class EmployeeDto {
    String name;
    String dept;
    Integer age;

    public String getName()
    {
        return this.name;
    }
    public String getDept()
    {
        return this.dept;
    }
    public Integer getAge()
    {
        return this.age;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    public void setDept(String dept)
    {
        this.dept = dept;
    }
    public void setAge(Integer age)
    {
        this.age = age;
    }

    public EmployeeDto EmployeeMapper(Employee employee)
    {
        this.name = employee.getName();
        this.dept = employee.getDept();
        this.age = employee.getAge();
        return this;
    }
}
