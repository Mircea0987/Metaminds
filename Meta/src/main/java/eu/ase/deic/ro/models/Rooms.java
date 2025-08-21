package eu.ase.deic.ro.models;


import jakarta.persistence.*;


@Entity
@Table(name = "rooms")

public class Rooms  {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 @Column(name = "id_camera")
 private Long idCamera;

 @ManyToOne
 @JoinColumn(name = "id_tip_camera")
 private TipCamera tipCamera;

 @Column(name = "id_apartament")
 private Long idApartament;

 @Column(name = "pret_lunar")
 private Double pretLunar;

 @Column(name = "este_disponibil")
 private Boolean esteDisponibil;

 @Column(name = "dimensiune")
 private Double dimensiune;

public Long getIdCamera() {
	return idCamera;
}

public TipCamera getTipCamera() {
	return tipCamera;
}

public Long getIdApartament() {
	return idApartament;
}

public Double getPretLunar() {
	return pretLunar;
}

public Boolean getEsteDisponibil() {
	return esteDisponibil;
}

public Double getDimensiune() {
	return dimensiune;
}

public void setIdCamera(Long idCamera) {
	this.idCamera = idCamera;
}

public void setTipCamera(TipCamera tipCamera) {
	this.tipCamera = tipCamera;
}

public void setIdApartament(Long idApartament) {
	this.idApartament = idApartament;
}

public void setPretLunar(Double pretLunar) {
	this.pretLunar = pretLunar;
}

public void setEsteDisponibil(Boolean esteDisponibil) {
	this.esteDisponibil = esteDisponibil;
}

public void setDimensiune(Double dimensiune) {
	this.dimensiune = dimensiune;
}
 
 
 
 
}