package eu.ase.deic.ro.models;


import jakarta.persistence.*;


@Entity
@Table(name = "tipConturi")

public class TipConturi {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 @Column(name = "id_tip")
 private Long idTip;

 @Column(name = "descriere")
 private String descriere;


public Long getIdTip() {
	return idTip;
}

public String getDescriere() {
	return descriere;
}

public String getProprietateEtc() {
	return descriere;
}

public void setIdTip(Long idTip) {
	this.idTip = idTip;
}

public void setDescriere(String descriere) {
	this.descriere = descriere;
}

public void setProprietateEtc(String proprietateEtc) {
	this.descriere = proprietateEtc;
}
 
 
}