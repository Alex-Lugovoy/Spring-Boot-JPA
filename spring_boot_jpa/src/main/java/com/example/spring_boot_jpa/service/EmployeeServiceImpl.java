package com.example.spring_boot_jpa.service;


import com.example.spring_boot_jpa.dao.EmployeeRepository;
import com.example.spring_boot_jpa.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public void saveEmployee(Employee emp) {
        employeeRepository.save(emp);
    }

    @Override
    public Employee getEmployee(int id) {
        Employee emp = null;
        Optional<Employee> employee = employeeRepository.findById(id);
        if (employee.isPresent())
        {
            emp = employee.get();
        }
        return emp;
    }

    @Override
    public void deleteEmployee(int id) {
        employeeRepository.deleteById(id);
    }

    public List<Employee> findAllByName(String name){
        return employeeRepository.findAllByName(name);
    }
}
