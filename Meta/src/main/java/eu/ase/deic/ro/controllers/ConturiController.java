package eu.ase.deic.ro.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import eu.ase.deic.ro.models.Conturi;
import eu.ase.deic.ro.service.ConturiService;

@RestController
public class ConturiController {

	@Autowired
	ConturiService conturiService;
	
	@GetMapping("/conturi")
	public List<Conturi> getAllConturi(){
		return conturiService.getAllConturi();
	}
	
	@GetMapping("/conturi/{id}")
	public Conturi getConturiBydId(@PathVariable("id") Long id) {
		return conturiService.getConturiById(id);
	}
}
