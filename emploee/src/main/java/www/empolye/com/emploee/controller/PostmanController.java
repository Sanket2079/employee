package www.empolye.com.emploee.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import www.empolye.com.emploee.enetity.repository.EmployeeRepository;
import www.empolye.com.emploee.entity.Employee;

@RestController
@RequestMapping("/Employee")
public class PostmanController {

	@Autowired
	EmployeeRepository employeerepository;
	
	@GetMapping("/{id}")
    public Optional<Employee> getEmployee(@PathVariable Long id) {
        return employeerepository.findById(id);
	}
	
	 @PostMapping
	    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) {
	        Employee saved = employeerepository.save(employee);
	        return ResponseEntity.ok(saved);
	 }
}
