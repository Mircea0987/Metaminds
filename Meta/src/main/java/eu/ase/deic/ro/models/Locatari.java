package eu.ase.deic.ro.models;


import jakarta.persistence.*;


import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "locatari")

public class Locatari {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_loc")
    private Long idLoc;

    @OneToOne
    @JoinColumn(name = "id_cont")
    private Conturi cont;

    @Column(name = "data_nasterii")
    private LocalDate dataNasterii;

    @Column(name = "nume")
    private String nume;

    @Column(name = "prenume")
    private String prenume;

    @Column(name = "email")
    private String email;

    @Column(name = "nr_telefon")
    private String nrTelefon;

    @Column(name = "este_student")
    private Boolean esteStudent;

    @ManyToMany
    @JsonBackReference
    private List<Apartamente> apartamente;

	public Long getIdLoc() {
		return idLoc;
	}

	public Conturi getCont() {
		return cont;
	}

	public LocalDate getDataNasterii() {
		return dataNasterii;
	}

	public String getNume() {
		return nume;
	}

	public String getPrenume() {
		return prenume;
	}

	public String getEmail() {
		return email;
	}

	public String getNrTelefon() {
		return nrTelefon;
	}

	public Boolean getEsteStudent() {
		return esteStudent;
	}

	public List<Apartamente> getApartamente() {
		return apartamente;
	}

	public void setIdLoc(Long idLoc) {
		this.idLoc = idLoc;
	}

	public void setCont(Conturi cont) {
		this.cont = cont;
	}

	public void setDataNasterii(LocalDate dataNasterii) {
		this.dataNasterii = dataNasterii;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setNrTelefon(String nrTelefon) {
		this.nrTelefon = nrTelefon;
	}

	public void setEsteStudent(Boolean esteStudent) {
		this.esteStudent = esteStudent;
	}

	public void setApartamente(List<Apartamente> apartamente) {
		this.apartamente = apartamente;
	}
    
    
}