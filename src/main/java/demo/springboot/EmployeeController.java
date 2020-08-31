package demo.springboot;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@GetMapping("/empinfo")
	public ResponseEntity<?> getEmployee() {
		Employee emp= new Employee("amit", "E-123333");
		return new ResponseEntity<>(emp, HttpStatus.OK);
	}
}
