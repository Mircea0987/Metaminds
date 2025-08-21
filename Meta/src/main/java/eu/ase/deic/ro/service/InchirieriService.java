package eu.ase.deic.ro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eu.ase.deic.ro.models.Inchirieri;
import eu.ase.deic.ro.repository.InchirieriRepo;

@Service
public class InchirieriService {
	
	@Autowired
	InchirieriRepo inchirieriRepo;
	
	public List<Inchirieri> getAllInchirieri(){
		return inchirieriRepo.findAll();
	}
	public Inchirieri getInchirieriById(Long id) {
		return inchirieriRepo.findById(id).orElse(null);
	}
}
