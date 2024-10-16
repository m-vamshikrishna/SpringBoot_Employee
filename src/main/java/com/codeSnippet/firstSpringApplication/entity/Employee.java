package com.codeSnippet.firstSpringApplication.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
    @Id
    Integer id;
    String name;
    String dept;
    Integer age;


    public Integer getId()
    {
        return this.id;
    }
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
//    public void setId(Integer id)
//    {
//        this.id = id;
//    }
//    public void setName(String name)
//    {
//        this.name = name;
//    }
//    public void setDept(String dept)
//    {
//        this.dept = dept;
//    }
//    public void setAge(Integer age)
//    {
//        this.age = age;
//    }

    public Employee(Integer id,String name,String dept, Integer age)
    {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.age = age;
    }

}
