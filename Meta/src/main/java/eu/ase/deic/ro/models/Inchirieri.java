package eu.ase.deic.ro.models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;



import java.time.LocalDate;

@Entity
@Table(name = "inchirieri")

public class Inchirieri {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 @Column(name = "id_rezervare")
 private Long idRezervare;

 @ManyToOne
 @JoinColumn(name = "id_locatar")
 private Locatari locatar;

 @ManyToOne
 @JoinColumn(name = "id_camera")
 private Rooms camera;

 @Column(name = "data_inceput")
 private LocalDate dataInceput;

 @Column(name = "data_final")
 private LocalDate dataFinal;

public Long getIdRezervare() {
	return idRezervare;
}

public Locatari getLocatar() {
	return locatar;
}

public Rooms getCamera() {
	return camera;
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

public void setLocatar(Locatari locatar) {
	this.locatar = locatar;
}

public void setCamera(Rooms camera) {
	this.camera = camera;
}

public void setDataInceput(LocalDate dataInceput) {
	this.dataInceput = dataInceput;
}

public void setDataFinal(LocalDate dataFinal) {
	this.dataFinal = dataFinal;
}
 
 
}