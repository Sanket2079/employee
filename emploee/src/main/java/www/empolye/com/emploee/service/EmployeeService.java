package www.empolye.com.emploee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import www.empolye.com.emploee.enetity.repository.EmployeeRepository;
import www.empolye.com.emploee.entity.Employee;

@Service
public class EmployeeService {

	
	@Autowired
	EmployeeRepository employeerepository;
	
	
	public Employee getEmployee(int id,String name, String department, int salary) {
	Employee employee = new Employee();
	employee.setId(id);
	employee.setName(name);
	employee.setDepartment(department);
	employee.setSalary(salary);
	
	return employeerepository.save(employee);
}
}