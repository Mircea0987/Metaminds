package eu.ase.deic.ro.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import eu.ase.deic.ro.models.Recenzii;
import eu.ase.deic.ro.service.RecenziiService;

@RestController
public class RecenziiController {

	@Autowired
	RecenziiService recenziiService;
	
	@GetMapping("/recenzii")
	public List<Recenzii> getAll(){
		return recenziiService.getAllReviews();
	}
}
