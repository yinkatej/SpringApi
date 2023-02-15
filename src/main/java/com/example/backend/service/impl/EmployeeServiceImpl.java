package com.example.backend.service.impl;

import com.example.backend.model.Employee;
import com.example.backend.repository.EmployeeRepository;
import com.example.backend.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository repository;
    EmployeeServiceImpl(EmployeeRepository repository    ){
        super();
        this.repository = repository;
    }
    @Override
    public Employee saveEmployee(Employee employee){
        return repository.save(employee);
    }
}
