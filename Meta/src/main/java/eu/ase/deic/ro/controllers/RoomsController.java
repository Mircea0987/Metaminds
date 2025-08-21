package eu.ase.deic.ro.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import eu.ase.deic.ro.models.Rooms;
import eu.ase.deic.ro.service.RoomsService;

@RestController
public class RoomsController {

	@Autowired
	RoomsService roomsService;
	
	@GetMapping("/room/{id}")
	public ResponseEntity<Rooms> getRoomById(@PathVariable("id") Long id) {
				
		Rooms r = roomsService.getRoomById(id);
		
		if(r != null) {
			
			return new ResponseEntity<Rooms>(r,HttpStatus.OK);
			
		}else {
			
			return new ResponseEntity<Rooms>(HttpStatus.NOT_FOUND);
		}
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
	
	@DeleteMapping("/rooms/delete/{id}")
	public void deleteByRoomId(@PathVariable("id") Long id) {
		 roomsService.deleteRoomById(id);
	}
	
	@PutMapping("/rooms/update")
	public void updateByRoomId(@RequestBody Rooms room) {
		roomsService.updateRoom(room);
	}
	
}
