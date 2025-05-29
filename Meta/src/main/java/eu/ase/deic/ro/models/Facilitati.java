package eu.ase.deic.ro.models;

import jakarta.persistence.*;


@Entity
@Table(name = "facilitati")

public class Facilitati {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "descriere")
    private String descriere;

	public Long getId() {
		return id;
	}

	public String getDescriere() {
		return descriere;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setDescriere(String descriere) {
		this.descriere = descriere;
	}
    
}