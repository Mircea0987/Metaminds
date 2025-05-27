package eu.ase.deic.ro.models;



import jakarta.persistence.*;


@Entity
@Table(name = "proprietari")

public class Proprietari {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;

 @Column(name = "nume")
 private String nume;

 @Column(name = "prenume")
 private String prenume;

 @Column(name = "varsta")
 private Integer varsta;

 @Column(name = "numar_telefon")
 private String numarTelefon;

 @Column(name = "a_verificat")
 private Boolean aVerificat;

 @OneToOne
 @JoinColumn(name = "id_cont")
 private Conturi cont;

public Long getId() {
	return id;
}

public String getNume() {
	return nume;
}

public String getPrenume() {
	return prenume;
}

public Integer getVarsta() {
	return varsta;
}

public String getNumarTelefon() {
	return numarTelefon;
}

public Boolean getaVerificat() {
	return aVerificat;
}

public Conturi getCont() {
	return cont;
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

public void setVarsta(Integer varsta) {
	this.varsta = varsta;
}

public void setNumarTelefon(String numarTelefon) {
	this.numarTelefon = numarTelefon;
}

public void setaVerificat(Boolean aVerificat) {
	this.aVerificat = aVerificat;
}

public void setCont(Conturi cont) {
	this.cont = cont;
}
 
 
}