package com.example.HR.service;

import com.example.HR.model.Employee;
import com.example.HR.respository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired //Spring bu alanı otomatik olarak inject/enjekte eder
 private EmployeeRepository employeeRepository;//new ledik,kopyaladık//interfaceden kopyaladık

public Employee hireEmployee(Employee employee){//işe alma
        //yeni bir çalışanı veritabanına kaydeder.JPA dan gelen save ile kaydeder
        return employeeRepository.save(employee);
    }
public List<Employee> getAllEmployess(){
        //tüm çalışanları veritabanından findAll ile getirir
        return employeeRepository.findAll();
}
public Optional<Employee> getEmployeeById(Long id){
        //optional özel bir özelliğe göre sıralama için kullanırız
        return employeeRepository.findById(id);
    }
public Employee updateEmployee(Long id,Employee employeeDetails) {
    Employee employee = employeeRepository.findById(id).orElseThrow(() -> new RuntimeException("ÇALIŞAN BULUNAMADI"));
    //IF ELSE metodu gibi yazdık
    //orElse yani if döngüsünün elsekısmı gibi düşünebiliriz .

    employee.setName(employeeDetails.getName());
    employee.setPosition(employeeDetails.getPosition());
    return employeeRepository.save(employee);
}
 public void fireEmployee(Long id) {
     Employee employee = employeeRepository.findById(id).orElseThrow(() -> new RuntimeException("ÇALIŞAN BULUNAMADI"));
     employeeRepository.delete(employee);
 }

}
