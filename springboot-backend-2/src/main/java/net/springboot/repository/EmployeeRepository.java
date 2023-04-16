package net.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.springboot.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
