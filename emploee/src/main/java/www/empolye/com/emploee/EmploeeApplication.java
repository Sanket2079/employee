package www.empolye.com.emploee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import www.empolye.com.emploee.entity.Employee;

@SpringBootApplication
public class EmploeeApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmploeeApplication.class, args);
		
		Employee employee = new Employee();
	}

}
