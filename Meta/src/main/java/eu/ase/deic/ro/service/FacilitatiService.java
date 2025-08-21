package eu.ase.deic.ro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eu.ase.deic.ro.models.Facilitati;
import eu.ase.deic.ro.repository.FacilitatiRepo;

@Service
public class FacilitatiService {

	@Autowired
	FacilitatiRepo facilitatiRepo;
	
	public List<Facilitati> getAllFacilitati(){
		return facilitatiRepo.findAll();
	}
	
	public Facilitati getFacilitatiById(Long id) {
		return facilitatiRepo.findById(id).orElse(null);
	}
	
}
