package eu.ase.deic.ro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import eu.ase.deic.ro.models.TipFacturi;
import eu.ase.deic.ro.repository.TipFacturiRepo;

@Service
public class TipFacturiService {

	@Autowired
	TipFacturiRepo tipFacturiRepo;
	
	public List<TipFacturi> getAllFacturi(){
		return tipFacturiRepo.findAll();
	}
	
	public TipFacturi getFacturibydId(Long id) {
		return tipFacturiRepo.findById(id).orElse(null);
	}
	
}
