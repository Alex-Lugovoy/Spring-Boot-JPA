package com.example.spring_boot_jpa.service;

import com.example.spring_boot_jpa.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployees();
    public void saveEmployee(Employee emp);
    public Employee getEmployee(int id);
    public void deleteEmployee(int id);
    public List<Employee> findAllByName(String name);
}
