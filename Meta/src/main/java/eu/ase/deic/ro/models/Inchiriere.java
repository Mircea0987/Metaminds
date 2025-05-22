package eu.ase.deic.ro.models;

import java.time.LocalDate;

public class Inchiriere {
	
	private Long idRezervare;
	private Locatar idLocatar;
	private Camera idCamera;
	private LocalDate dataInceput;
	private LocalDate dataFinal;
	
	
	
	public Inchiriere(Long idRezervare, Locatar idLocatar, Camera idCamera, LocalDate dataInceput,
			LocalDate dataFinal) {
		this.idRezervare = idRezervare;
		this.idLocatar = idLocatar;
		this.idCamera = idCamera;
		this.dataInceput = dataInceput;
		this.dataFinal = dataFinal;
	}

	public Long getIdRezervare() {
		return idRezervare;
	}
	
	public Locatar getIdLocatar() {
		return idLocatar;
	}
	
	public Camera getIdCamera() {
		return idCamera;
	}
	
	public LocalDate getDataInceput() {
		return dataInceput;
	}
	
	public LocalDate getDataFinal() {
		return dataFinal;
	}
	
	public void setIdRezervare(Long idRezervare) {
		this.idRezervare = idRezervare;	
	}
	
	public void setIdLocatar(Locatar idLocatar) {
		this.idLocatar = idLocatar;
	}
	
	public void setIdCamera(Camera idCamera) {
		this.idCamera = idCamera;
	}
	
	public void setDataInceput(LocalDate dataInceput) {
		this.dataInceput = dataInceput;
	}
	
	public void setDataFinal(LocalDate dataFinal) {
		this.dataFinal = dataFinal;
	}
	
	
	

}
