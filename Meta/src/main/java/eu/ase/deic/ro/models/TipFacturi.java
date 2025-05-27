package eu.ase.deic.ro.models;

import jakarta.persistence.*;


@Entity
@Table(name = "tipFacturi")

public class TipFacturi {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 @Column(name = "id_tip_factura")
 private Long idTipFactura;

 @Column(name = "descriere")
 private String descriere;

public Long getIdTipFactura() {
	return idTipFactura;
}

public String getDescriere() {
	return descriere;
}

public void setIdTipFactura(Long idTipFactura) {
	this.idTipFactura = idTipFactura;
}

public void setDescriere(String descriere) {
	this.descriere = descriere;
}
 
 
}