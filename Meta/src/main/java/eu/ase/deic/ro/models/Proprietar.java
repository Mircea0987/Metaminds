package eu.ase.deic.ro.models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Proprietar {
	
	@Id
	private Long id;
	private String nume;
	private String prenume;
	private int varsta;
	private String numarTelefon;
	private List<Apartament> apartmentList;
	private boolean isVerified;
	
	public Proprietar(Long id, String nume, String prenume, int varsta, String numarTelefon, boolean isVerified, List<Apartament> apartamentList) {
		this.id = id;
		this.nume = nume;
		this.prenume = prenume;
		this.varsta = varsta;
		this.numarTelefon = numarTelefon;
		this.isVerified = isVerified;
		this.apartmentList = apartamentList;
	}
	
	public Long getId() {
		return id;
	}
	public String getNume() {
		return nume;
	}
	public String getPrenume() {
		return prenume;
	}
	public int getVarsta() {
		return varsta;
	}
	public String getNumarTelefon() {
		return numarTelefon;
	}
	public boolean isVerified() {
		return isVerified;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}
	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}
	public void setNumarTelefon(String numarTelefon) {
		this.numarTelefon = numarTelefon;
	}
	public void setVerified(boolean isVerified) {
		this.isVerified = isVerified;
	}

	public List<Apartament> getApartmentList() {
		return apartmentList;
	}

	public void setApartmentList(List<Apartament> apartmentList) {
		this.apartmentList = apartmentList;
	}
	
	
	
}
