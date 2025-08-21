package eu.ase.deic.ro.models;

import jakarta.persistence.*;


import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "recenzii")

public class Recenzii {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 @Column(name = "id_recenzii")
 private Long idRecenzii;

 @Column(name = "comentariu")
 private String comentariu;

 @Column(name = "rating")
 private Integer rating;

 @Column(name = "data")
 private LocalDate data;

 @ManyToOne
 @JoinColumn(name = "id_apartament")
 @JsonBackReference
 private Apartamente apartament;

 @ManyToOne
 @JoinColumn(name = "id_locatar")
 private Locatari locatar;

public Long getIdRecenzii() {
	return idRecenzii;
}

public String getComentariu() {
	return comentariu;
}

public Integer getRating() {
	return rating;
}

public LocalDate getData() {
	return data;
}

public Apartamente getApartament() {
	return apartament;
}

public Locatari getLocatar() {
	return locatar;
}

public void setIdRecenzii(Long idRecenzii) {
	this.idRecenzii = idRecenzii;
}

public void setComentariu(String comentariu) {
	this.comentariu = comentariu;
}

public void setRating(Integer rating) {
	this.rating = rating;
}

public void setData(LocalDate data) {
	this.data = data;
}

public void setApartament(Apartamente apartament) {
	this.apartament = apartament;
}

public void setLocatar(Locatari locatar) {
	this.locatar = locatar;
}
 
 
}