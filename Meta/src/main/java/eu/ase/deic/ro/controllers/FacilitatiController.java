package eu.ase.deic.ro.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import eu.ase.deic.ro.models.Facilitati;
import eu.ase.deic.ro.service.FacilitatiService;

@RestController
public class FacilitatiController {

	@Autowired
	FacilitatiService facilitatiService;

	@GetMapping("/facilitati")
	public List<Facilitati> getAllFacilitati(){
		return facilitatiService.getAllFacilitati();	
	}
	
	@GetMapping("/facilitati/{id}")
	public Facilitati getFacilitatiById(@PathVariable("id") Long id) {
		return facilitatiService.getFacilitatiById(id);
	}
}
