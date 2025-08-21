package eu.ase.deic.ro.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import eu.ase.deic.ro.models.TipCamera;
import eu.ase.deic.ro.service.TipCameraService;

@RestController
public class TipCameraController {

	@Autowired
	TipCameraService tipCameraService;
	
	@GetMapping("/tipCamera")
	public List<TipCamera> getAllTipCamera(){
		return tipCameraService.getAllTipCamera();
	}
	
	@GetMapping("/tipCamera/{id}")
	public TipCamera getTipCameraById(@PathVariable("id") Long id) {
		return tipCameraService.getTipCameraById(id);
	}
	
}
