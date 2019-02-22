package cdc.mitrais.springboot.appone.dao;

import org.springframework.data.repository.CrudRepository;

import cdc.mitrais.springboot.appone.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
