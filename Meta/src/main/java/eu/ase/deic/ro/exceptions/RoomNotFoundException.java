package eu.ase.deic.ro.exceptions;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

public class RoomNotFoundException extends RuntimeException{

	public RoomNotFoundException(Long id) {
		super("Room with id " + id + " not found!");
	}
}
