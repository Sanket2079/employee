package www.empolye.com.emploee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import www.empolye.com.emploee.enetity.repository.EmployeeRepository;
import www.empolye.com.emploee.entity.Employee;
import www.empolye.com.emploee.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeservice;
	
	@Autowired
	EmployeeRepository employeerepository;
	
	@GetMapping("/Employee")
	public String gethome() {
		return "Index";
	}
	
	@PostMapping("/submit-form")
	public String getResult(@RequestParam ("id")int id,@RequestParam ("name")String name,@RequestParam ("department")String department,@RequestParam ("salary")int salary, Model model) {
		
		Employee employee = employeeservice.getEmployee(id,name,department,salary);
		model.addAttribute("employee", employee);
		
		return "result";
	}
	
}
