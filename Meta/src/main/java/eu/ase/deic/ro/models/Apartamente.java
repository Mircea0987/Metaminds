package eu.ase.deic.ro.models;
import jakarta.persistence.*;


import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "apartamente")

public class Apartamente {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;

 @Column(name = "descriere")
 private String descriere;

 @OneToOne
 @JoinColumn(name = "id_room")
 private Rooms room;


 @Column(name = "numar_camera")
 private Integer numarCamera;

 @Column(name = "etaj")
 private Integer etaj;

 @ManyToOne
 @JoinColumn(name = "id_proprietar")
 private Proprietari proprietar;

 @ManyToOne
 @JoinColumn(name = "id_facilitati")
 private Facilitati facilitati;

 @ManyToMany
 @JoinTable(
     name = "facturi_apartamente",
     joinColumns = @JoinColumn(name = "id_apartament"),
     inverseJoinColumns = @JoinColumn(name = "id_factura")
 )
 private List<Facturi> facturi;

 @OneToMany(mappedBy = "apartament")
 @JsonManagedReference
 private List<Recenzii> recenzii;

 @ManyToMany
 @JoinTable(
     name = "apartamente_locatori",
     joinColumns = @JoinColumn(name = "id_apartament"),
     inverseJoinColumns = @JoinColumn(name = "id_locatar")
 )
 @JsonManagedReference
 private List<Locatari> locatari;

public Long getId() {
	return id;
}

public String getDescriere() {
	return descriere;
}

public Proprietari getProprietar() {
	return proprietar;
}

public Integer getNumarCamera() {
	return numarCamera;
}

public Integer getEtaj() {
	return etaj;
}

public Rooms getRoom() {
	return room;
}

public Facilitati getFacilitati() {
	return facilitati;
}

public List<Facturi> getFacturi() {
	return facturi;
}

public List<Recenzii> getRecenzii() {
	return recenzii;
}

public List<Locatari> getLocatari() {
	return locatari;
}

public void setId(Long id) {
	this.id = id;
}

public void setDescriere(String descriere) {
	this.descriere = descriere;
}

public void setProprietar(Proprietari proprietar) {
	this.proprietar = proprietar;
}

public void setNumarCamera(Integer numarCamera) {
	this.numarCamera = numarCamera;
}

public void setEtaj(Integer etaj) {
	this.etaj = etaj;
}

public void setRoom(Rooms room) {
	this.room = room;
}

public void setFacilitati(Facilitati facilitati) {
	this.facilitati = facilitati;
}

public void setFacturi(List<Facturi> facturi) {
	this.facturi = facturi;
}

public void setRecenzii(List<Recenzii> recenzii) {
	this.recenzii = recenzii;
}

public void setLocatari(List<Locatari> locatari) {
	this.locatari = locatari;
}
 
 
 
}
