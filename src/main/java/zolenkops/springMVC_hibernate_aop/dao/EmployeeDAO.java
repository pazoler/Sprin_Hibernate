package zolenkops.springMVC_hibernate_aop.dao;

import zolenkops.springMVC_hibernate_aop.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> getAllEmployees();


   public void saveEmployee(Employee employee);
}
