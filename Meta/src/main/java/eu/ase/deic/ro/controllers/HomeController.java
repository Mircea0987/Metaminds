package eu.ase.deic.ro.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import eu.ase.deic.ro.models.Rooms;
import eu.ase.deic.ro.service.RoomsService;


@RestController
public class HomeController {
	
	@Autowired
	RoomsService roomsService;
	
	@RequestMapping("/home")
	public String hello() {
		System.out.println("Hello");
		return "index.html";
	}
	@RequestMapping("/test")
	public List<Rooms> getAll(){
		 List<Rooms> rooms = roomsService.getAllRooms();
		  return rooms;
	}
	@RequestMapping("/rooms/sorted")
	public List<Rooms> getAllRoomsSorted(){
		return roomsService.getSortByPrice();
	}

}
