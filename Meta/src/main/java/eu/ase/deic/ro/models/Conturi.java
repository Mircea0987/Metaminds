package eu.ase.deic.ro.models;



import jakarta.persistence.*;

@Entity
@Table(name = "conturi")
public class Conturi {
	
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 @Column(name = "id_cont")
 private Long idCont;

 @Column(name = "cnp")
 private Long cnp;

 @ManyToOne
 @JoinColumn(name = "id_tipCont")
 private TipConturi tipCont;

public Long getIdCont() {
	return idCont;
}

public Long getCnp() {
	return cnp;
}

public TipConturi getTipCont() {
	return tipCont;
}

public void setIdCont(Long idCont) {
	this.idCont = idCont;
}

public void setCnp(Long cnp) {
	this.cnp = cnp;
}

public void setTipCont(TipConturi tipCont) {
	this.tipCont = tipCont;
}
 
 
}