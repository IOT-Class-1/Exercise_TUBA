package com.example.HR.controller;

import com.example.HR.model.Employee;
import com.example.HR.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController //Bu anotasyon,bu sınıfın bir control sınıfı/RESTful web servisi oldugunu belirtir
@RequestMapping("/api/employees")//temel url belirtir
public class EmployeeController {

@Autowired
    private EmployeeService employeeService;

@PostMapping("/hire")//çalışanı işe almak
    public Employee hireEmployee(@RequestBody Employee employee){
    return employeeService.hireEmployee(employee);
}
@GetMapping
    public List<Employee> getAllEmployees(){
    return employeeService.getAllEmployess();
}

@GetMapping("/{id}")
    public Optional<Employee> getEmployeeById(@PathVariable Long id){
    return employeeService.getEmployeeById(id);
    }
    @PutMapping("/{id}")
    public Employee updateEmployee(@PathVariable Long id,@RequestBody Employee employeeDetails) {
        return employeeService.updateEmployee(id, employeeDetails);
    }

    @DeleteMapping("/fire/{id}")
    public void fireEmployee(@PathVariable Long id) {
        employeeService.fireEmployee(id);
    }
}