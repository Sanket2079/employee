package www.empolye.com.emploee.enetity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import www.empolye.com.emploee.entity.Employee;


public interface EmployeeRepository extends JpaRepository<Employee , Long>{

}