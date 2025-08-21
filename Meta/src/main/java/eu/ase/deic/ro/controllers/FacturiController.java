package eu.ase.deic.ro.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import eu.ase.deic.ro.models.Facturi;
import eu.ase.deic.ro.service.FacturiService;

@RestController
public class FacturiController {
	
	@Autowired
	FacturiService facturiService;
	
	@GetMapping("/facturi")
	public List<Facturi> getAllFacturi(){
		return facturiService.getAllFacturi();
	}
	
	@GetMapping("/facturi/{id}")
	public Facturi getFacturiById(@PathVariable("id") Long id) {
		return facturiService.getFacturiBydId(id);
	}
	
}
