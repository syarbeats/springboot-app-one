package cdc.mitrais.springboot.appone.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import cdc.mitrais.springboot.appone.model.Employee;

public interface EmployeeRepositoryWithPaging extends PagingAndSortingRepository<Employee, Integer>  {

}
