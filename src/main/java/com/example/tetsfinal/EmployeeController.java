package com.example.tetsfinal;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
@RequestMapping("emp")
public class EmployeeController {
@Autowired
private EmployeeDao edao;

@GetMapping(value="/", produces = "application/json")
public Employees getEmployees() {
	return edao.getAllEmployees();
}
@PostMapping(value="/", consumes = "application/json", produces = "application/json")
public ResponseEntity<Object> addEmployee(@RequestBody Employee e){
	Integer id= edao.getAllEmployees().getEmployees().size()+1;
	e.setId(id);
	edao.addEmployee(e);
	
	URI locatio=ServletUriComponentsBuilder.fromCurrentRequest()
			.path("/{id}")
			.buildAndExpand(e.getId())
			.toUri();
	
	return ResponseEntity.created(locatio).build();
			
	
}
}
