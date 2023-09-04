package com.example.demo;

public class Employee1 {
    String name;
    int salary;

    public Employee1(String name, int salary){
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
