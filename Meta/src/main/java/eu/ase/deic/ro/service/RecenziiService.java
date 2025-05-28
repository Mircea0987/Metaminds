package eu.ase.deic.ro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eu.ase.deic.ro.models.Recenzii;
import eu.ase.deic.ro.repository.RecenziiRepo;

@Service
public class RecenziiService {

	@Autowired
	RecenziiRepo reviewRepo;
	
	public List<Recenzii> getAllReviews(){
		return reviewRepo.findAll();
	}
	
}
