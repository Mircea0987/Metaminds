package eu.ase.deic.ro.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import eu.ase.deic.ro.models.Inchirieri;
import eu.ase.deic.ro.service.InchirieriService;

@RestController
public class InchirieriController {


	@Autowired
	InchirieriService inchirieriService;

	@GetMapping("/inchirieri")
	public List<Inchirieri> getAllInchirieri(){
		return inchirieriService.getAllInchirieri();
	}
	
	@GetMapping("/inchirieri/{id}")
	public Inchirieri getInchirieriById(@PathVariable("id") Long id) {
		return inchirieriService.getInchirieriById(id);
	}
	
}
