package eu.ase.deic.ro.models;


import jakarta.persistence.*;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "facturi")

public class Facturi {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 @Column(name = "id_factura")
 private Long idFactura;

 @ManyToOne
 @JoinColumn(name = "id_tip_factura")
 private TipFacturi tipFactura;

 @ManyToMany(mappedBy = "facturi")
 @JsonBackReference
 private List<Apartamente> apartamente;

public Long getIdFactura() {
	return idFactura;
}

public TipFacturi getTipFactura() {
	return tipFactura;
}

public List<Apartamente> getApartamente() {
	return apartamente;
}

public void setIdFactura(Long idFactura) {
	this.idFactura = idFactura;
}

public void setTipFactura(TipFacturi tipFactura) {
	this.tipFactura = tipFactura;
}

public void setApartamente(List<Apartamente> apartamente) {
	this.apartamente = apartamente;
}
 
 
 
}