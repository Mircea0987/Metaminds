package eu.ase.deic.ro.models;

import java.util.List;

import jakarta.persistence.Entity;

@Entity
public class Apartment {
	
	private Long roomId;
	private boolean hasAC;
	private int nbOfRooms;
	private String[] description;
	private boolean isAvailable;
	private Owner owner;
	private RoomType roomType;
	private List<String> facilities;//Wi-fi minibar etc
	private int floorNb;
	private double pricePerNight;
	
	public long getRoomId() {
		return roomId;
	}
	public boolean isHasAC() {
		return hasAC;
	}
	public int getNbOfRooms() {
		return nbOfRooms;
	}
	public String[] getDescription() {
		return description;
	}
	public boolean isAvailable() {
		return isAvailable;
	}
	public Owner getOwner() {
		return owner;
	}
	public RoomType getRoomType() {
		return roomType;
	}
	public List<String> getFacilities() {
		return facilities;
	}
	public int getFloorNb() {
		return floorNb;
	}
	public double getPricePerNight() {
		return pricePerNight;
	}
	public void setRoomId(long roomId) {
		this.roomId = roomId;
	}
	public void setHasAC(boolean hasAC) {
		this.hasAC = hasAC;
	}
	public void setNbOfRooms(int nbOfRooms) {
		this.nbOfRooms = nbOfRooms;
	}
	public void setDescription(String[] description) {
		this.description = description;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	public void setOwner(Owner owner) {
		this.owner = owner;
	}
	public void setRoomType(RoomType roomType) {
		this.roomType = roomType;
	}
	public void setFacilities(List<String> facilities) {
		this.facilities = facilities;
	}
	public void setFloorNb(int floorNb) {
		this.floorNb = floorNb;
	}
	public void setPricePerNight(double pricePerNight) {
		this.pricePerNight = pricePerNight;
	}
	
	


	

}
