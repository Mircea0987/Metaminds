package eu.ase.deic.ro.models;


import jakarta.persistence.*;


@Entity
@Table(name = "tip_camera")

public class TipCamera {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 @Column(name = "id_tip_camera")
 private Long idTipCamera;

 @Column(name = "descriere")
 private String descriere;

public Long getIdTipCamera() {
	return idTipCamera;
}

public String getDescriere() {
	return descriere;
}

public void setIdTipCamera(Long idTipCamera) {
	this.idTipCamera = idTipCamera;
}

public void setDescriere(String descriere) {
	this.descriere = descriere;
}
 
 
}