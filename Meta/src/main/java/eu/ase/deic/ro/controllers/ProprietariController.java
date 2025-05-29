package eu.ase.deic.ro.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import eu.ase.deic.ro.models.Proprietari;
import eu.ase.deic.ro.service.ProprietariService;

@RestController
public class ProprietariController {

	@Autowired
	ProprietariService proprietariService;
	
	@GetMapping("/proprietari")
	public List<Proprietari> getAllProprietari(){
		return proprietariService.getAllProprietari();
	}
	
	@GetMapping("/proprietari/{id}")
	public Proprietari getProprietarById(@PathVariable("id") Long id) {
		return proprietariService.getProprietarById(id);
	}
	
	@GetMapping("/proprietari/sorted")
	public List<Proprietari> getProprietariSortedByName(){
		return proprietariService.getProprietariSortedByName();
	}
	
}
