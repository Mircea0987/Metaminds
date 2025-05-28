package eu.ase.deic.ro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eu.ase.deic.ro.exceptions.LocatariExeception;
import eu.ase.deic.ro.models.Locatari;
import eu.ase.deic.ro.repository.LocatariRepo;

@Service
public class LocatariService {

	@Autowired
	LocatariRepo locatariRepo;
	
	public List<Locatari>getAllLocatari(){
		return locatariRepo.findAll();
	}
	public Locatari getLocatarById(Long id){
		return locatariRepo.findById(id).orElseThrow(()-> new LocatariExeception(id));
	}
	public void addLocatar(Locatari l) {
		locatariRepo.save(l);
	}
}
