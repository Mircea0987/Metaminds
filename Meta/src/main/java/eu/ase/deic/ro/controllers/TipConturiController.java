package eu.ase.deic.ro.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import eu.ase.deic.ro.models.TipConturi;
import eu.ase.deic.ro.service.TipConturiService;

@RestController
public class TipConturiController {

	@Autowired
	TipConturiService tipConturiService;
	
	@GetMapping("/tipConturi")
	public List<TipConturi> getAllTipConturi(){
		return tipConturiService.getAllTipConturi();
	}
	
	@GetMapping("/tipConturi/{id}")
	public TipConturi getTipConturiById(@PathVariable("id") Long id) {
		return tipConturiService.getTipConturiById(id);
	}
	
}
