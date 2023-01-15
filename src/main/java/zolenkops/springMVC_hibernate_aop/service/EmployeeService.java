package zolenkops.springMVC_hibernate_aop.service;

import zolenkops.springMVC_hibernate_aop.entity.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);
}
