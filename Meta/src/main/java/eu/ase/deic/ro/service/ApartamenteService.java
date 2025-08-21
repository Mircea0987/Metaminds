package eu.ase.deic.ro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eu.ase.deic.ro.models.Apartamente;
import eu.ase.deic.ro.repository.ApartamenteRepository;

@Service
public class ApartamenteService {
	
	@Autowired
	ApartamenteRepository apartamentRepo;
	
	public List<Apartamente> getAllApartments(){

		return apartamentRepo.findAll();
	}
	
	public Apartamente getApartmentById(Long id) {
		return apartamentRepo.findById(id).orElse(null);
	}
}
