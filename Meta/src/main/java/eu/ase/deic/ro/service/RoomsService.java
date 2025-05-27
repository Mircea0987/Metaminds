package eu.ase.deic.ro.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eu.ase.deic.ro.exceptions.RoomNotFoundException;
import eu.ase.deic.ro.models.Rooms;
import eu.ase.deic.ro.repository.RoomsRepo;

@Service
public class RoomsService {

	@Autowired
	RoomsRepo roomsRepo;
	
	public List<Rooms> getAllRooms(){
		
		return roomsRepo.findAll();
	}
	public Rooms getRoomById(Long id) {
	    return roomsRepo.findById(id).orElseThrow(() -> new RoomNotFoundException(id));
	}
	public List<Rooms> getAllAvailableRooms(){
		
		List<Rooms> room = roomsRepo.findAll();
		
		return room.stream().filter(Rooms::getEsteDisponibil).toList();
		
	}
}
