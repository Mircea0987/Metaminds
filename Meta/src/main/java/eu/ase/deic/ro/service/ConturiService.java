package eu.ase.deic.ro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eu.ase.deic.ro.models.Conturi;
import eu.ase.deic.ro.repository.ConturiRepository;

@Service
public class ConturiService {

	@Autowired
	ConturiRepository conturiRepo;
	
	public List<Conturi> getAllConturi(){
		return conturiRepo.findAll();
	}
	
	public Conturi getConturiById(Long id) {
		return conturiRepo.findById(id).orElse(null);
	}
}
