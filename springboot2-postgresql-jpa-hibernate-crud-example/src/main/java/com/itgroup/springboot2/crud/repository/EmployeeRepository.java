package com.itgroup.springboot2.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.itgroup.springboot2.crud.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
