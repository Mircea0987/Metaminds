package eu.ase.deic.ro.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import eu.ase.deic.ro.models.Locatari;
import eu.ase.deic.ro.service.LocatariService;

@RestController
public class LocatariController {
	
	@Autowired
	LocatariService locatariService;

	@GetMapping("/locatari/{id}")
	public Locatari gettLocatariById(@PathVariable("id") Long id){
		return locatariService.getLocatarById(id);
	}
	
	@GetMapping("/locatari")
	public List<Locatari> getAllLocatari(){
		return locatariService.getAllLocatari();
	}
}
