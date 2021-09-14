package com.poc.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.poc.donnee.domain.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
