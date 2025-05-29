package eu.ase.deic.ro.service;


import java.util.List;
import java.util.Optional;

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
		
	    return roomsRepo.findById(id).orElse(null);
	    
	}
	
	public List<Rooms> getAllAvailableRooms(){
		
		List<Rooms> room = roomsRepo.findAll();
		if(room == null) {
			//do something
		}
		
		return room.stream().filter(Rooms::getEsteDisponibil).toList();
		
	}
	
	public List<Rooms> getSortByPrice() {
		
		List<Rooms> room = roomsRepo.findAll();
		
		return room.stream().sorted((x1,x2)->{
			if(x1.getPretLunar() > x2.getPretLunar()) {
				return 1;
			}
			else if(x1.getPretLunar() == x2.getPretLunar()) {
				return 0;
			}else {
				return -1;
			}
		}).toList();
		
	}
	
	public void saveRoom(Rooms r) {
		roomsRepo.save(r);
	}
	
	public void deleteRoomById(Long id) {
		roomsRepo.deleteById(id);
	}
	
	public void updateRoom(Rooms room) {
		roomsRepo.save(room);
	}

}
