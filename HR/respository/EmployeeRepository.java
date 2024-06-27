package com.example.HR.respository;

import com.example.HR.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //bu anotasyosyon,bu sınıfın bir Spring veritabanı deposu oldugunu belirtir
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
//JPA--->CRUD(create,read,update,delete) işlemleri için gerekli metotları sağlar