package eu.ase.deic.ro.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import eu.ase.deic.ro.models.TipFacturi;
import eu.ase.deic.ro.service.TipFacturiService;

@RestController
public class TipFacturiController {

	@Autowired
	TipFacturiService tipFacturiService;
	
	@GetMapping("/tipFacturi")
	public List<TipFacturi> getAllTipFacturi(){
		return tipFacturiService.getAllFacturi();
	}
	
	@GetMapping("/tipFacturi/{id}")
	public TipFacturi getTipFacturiById(@PathVariable("id") Long id) {
		return tipFacturiService.getFacturibydId(id);
	}
	
}
