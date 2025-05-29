package eu.ase.deic.ro.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import eu.ase.deic.ro.models.Apartamente;
import eu.ase.deic.ro.service.ApartamenteService;

@RestController
public class ApartamenteController {

	@Autowired
	ApartamenteService apartmentService;
	
	@GetMapping("/apartamente")
	public List<Apartamente> getAllApartments(){
		
		return apartmentService.getAllApartments();
	}
	@GetMapping("/apartamente/{id}")
	public Apartamente getApartmentBydId(@PathVariable("id") Long id) {
		return apartmentService.getApartmentById(id);
	}
}
