package eu.ase.deic.ro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eu.ase.deic.ro.models.TipConturi;
import eu.ase.deic.ro.repository.TipConturiRepo;

@Service
public class TipConturiService {
	
	@Autowired
	TipConturiRepo tipConturiRepo;

	public List<TipConturi> getAllTipConturi(){
		return tipConturiRepo.findAll();
	}
	
	public TipConturi getTipConturiById(Long id) {
		return tipConturiRepo.findById(id).orElse(null);
	}
	
}
