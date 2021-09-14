package com.poc.infrastructure;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.poc.donnee.domain.Employee;
import com.poc.service.repository.EmployeeRepository;

import io.swagger.annotations.ApiOperation;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeRepository eRepo;

	@ApiOperation(value = "Ajout employée")
	@PostMapping("/employees")
	public Employee save(@RequestBody Employee employee) {
		return eRepo.save(employee);
	}

	@ApiOperation(value = "Liste des employées")
	@GetMapping("/employees")
	public List<Employee> get() {
		return eRepo.findAll();
	}

	@ApiOperation(value = "Récuperer l'employée par ID")
	@GetMapping("/employees/{id}")
	public Employee get(@PathVariable Long id) {
		Optional<Employee> employee = eRepo.findById(id);
		if (employee.isPresent()) {
			return employee.get();
		}
		throw new RuntimeException("Not found for the id " + id);
	}

	@ApiOperation(value = "Mettre à jour un employée")
	@PutMapping("/employees/{id}")
	public Employee update(@PathVariable Long id, @RequestBody Employee employee) {
		employee.setId(id);
		return eRepo.save(employee);
	}

	@ApiOperation(value = "Supprimer un employée par ID")
	@DeleteMapping("/employees/{id}")
	public ResponseEntity<HttpStatus> delete(@PathVariable Long id) {
		eRepo.deleteById(id);
		return new ResponseEntity<HttpStatus>(HttpStatus.NO_CONTENT);
	}

}
