package eu.ase.deic.ro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eu.ase.deic.ro.models.TipCamera;
import eu.ase.deic.ro.repository.TipCameraRepo;

@Service
public class TipCameraService {

	@Autowired
	TipCameraRepo tipCameraRepo;
	
	public List<TipCamera> getAllTipCamera(){
		return tipCameraRepo.findAll();
	}
	
	public TipCamera getTipCameraById(Long id) {
		return tipCameraRepo.findById(id).orElse(null);
	}
	
}
