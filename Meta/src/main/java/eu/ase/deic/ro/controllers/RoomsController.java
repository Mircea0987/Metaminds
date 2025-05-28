package eu.ase.deic.ro.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import eu.ase.deic.ro.models.Rooms;
import eu.ase.deic.ro.service.RoomsService;

@RestController
public class RoomsController {

	@Autowired
	RoomsService roomsService;
	
	@GetMapping("/room/{id}")
	public Rooms getRoomById(@PathVariable("id") Long id) {
		return roomsService.getRoomById(id);
	}
	
	@GetMapping("rooms/available")
	public List<Rooms> getAllAvailableRooms() {
		return roomsService.getAllAvailableRooms();
	}
	@GetMapping("/rooms")
	public List<Rooms> getAllRooms(){
		return roomsService.getAllRooms();
	}
	@PostMapping("/rooms/save")
	public void saveRoom(@RequestBody Rooms r) {
		roomsService.saveRoom(r);
	}
}
