package com.gordondickens.orm.openjpa.service;

import com.gordondickens.orm.openjpa.domain.Employee;

import java.util.List;

public interface EmployeeService {

    public long countAllEmployees();


    public void deleteEmployee(final Employee employee);


    public Employee findEmployee(final Long id);


    public List<Employee> findAllEmployees();


    public List<Employee> findEmployeeEntries(final int firstResult, final int maxResults);


    public void saveEmployee(final Employee employee);


    public Employee updateEmployee(final Employee employee);

}
