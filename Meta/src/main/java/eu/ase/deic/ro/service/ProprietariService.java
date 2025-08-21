package eu.ase.deic.ro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eu.ase.deic.ro.models.Proprietari;
import eu.ase.deic.ro.repository.ProprietariRepo;

@Service
public class ProprietariService {

	@Autowired
	ProprietariRepo proprietariRepo;
	
	public List<Proprietari> getAllProprietari(){
		return proprietariRepo.findAll();
	}
	
	public Proprietari getProprietarById(Long id){
		return proprietariRepo.findById(id).orElse(null);
	}
	
	public List<Proprietari> getProprietariSortedByName(){
		
		List<Proprietari> toBeSorted = proprietariRepo.findAll();
		
		return toBeSorted.stream().sorted((p1,p2)->{
			return p1.getNume().compareTo(p2.getNume());
		}).toList();
	}
}
