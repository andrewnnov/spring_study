package com.luv2code.springboot.cruddemo_hiber.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luv2code.springboot.cruddemo_hiber.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
