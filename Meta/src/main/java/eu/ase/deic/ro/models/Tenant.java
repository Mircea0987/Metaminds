package eu.ase.deic.ro.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Tenant {

	@Id
	private Long tenantId;
	private String name;
	private int age;
	private String email;
	private String phoneNumber;
	private boolean isSmoker; 
	private boolean hasPets;
	private String occupation;
	private double monthlyIncome;
	
	public long getTenantId() {
		return tenantId;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getEmail() {
		return email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public boolean isSmoker() {
		return isSmoker;
	}
	public boolean isHasPets() {
		return hasPets;
	}
	public String getOccupation() {
		return occupation;
	}
	public double getMonthlyIncome() {
		return monthlyIncome;
	}
	public void setTenantId(long tenantId) {
		this.tenantId = tenantId;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public void setSmoker(boolean isSmoker) {
		this.isSmoker = isSmoker;
	}
	public void setHasPets(boolean hasPets) {
		this.hasPets = hasPets;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public void setMonthlyIncome(double monthlyIncome) {
		this.monthlyIncome = monthlyIncome;
	}
	
	
	
	
}
