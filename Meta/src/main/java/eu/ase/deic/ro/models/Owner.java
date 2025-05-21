package eu.ase.deic.ro.models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Owner {

	@Id
	private Long ownerId;
	private String firstName;
	private String lastName;
	private int age;
	private List<Apartment> roomList;
	private String phoneNumber;
	private String address;
	private boolean isVerified;
	
	//mai trebuie constructori
	
	public long getOwnerId() {
		return ownerId;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public int getAge() {
		return age;
	}
	public List<Apartment> getRoomList() {
		return roomList;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public boolean isVerified() {
		return isVerified;
	}
	public void setOwnerId(long ownerId) {
		this.ownerId = ownerId;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setRoomList(List<Apartment> roomList) {
		this.roomList = roomList;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setVerified(boolean isVerified) {
		this.isVerified = isVerified;
	}
	
	public void addRoom(Apartment a) throws Exception{
		if(a!= null) {
			roomList.add(a);
		}else {
			throw new Exception("Invalid apartment!");
		}
		 
		
	}
	
	
	
	
	
	
	
	
}
