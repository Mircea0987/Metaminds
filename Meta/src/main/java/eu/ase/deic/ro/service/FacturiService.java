package eu.ase.deic.ro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eu.ase.deic.ro.models.Facturi;
import eu.ase.deic.ro.repository.FacturiRepo;

@Service
public class FacturiService {

	@Autowired
	FacturiRepo facturiRepo;
	
	public List<Facturi> getAllFacturi(){
		return facturiRepo.findAll();
	}
	
	public Facturi getFacturiBydId(Long id) {
		return facturiRepo.findById(id).orElse(null);
	}
	
}
