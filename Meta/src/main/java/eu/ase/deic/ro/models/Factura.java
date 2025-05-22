package eu.ase.deic.ro.models;

import java.util.List;

public class Factura {

	private Long idFactura;
	private TipFactura idTipFactura;
	private List<Apartament> apartamentList;
	
	public Factura(Long idFactura, TipFactura idTipFactura, List<Apartament> apartamentList) {
		this.idFactura = idFactura;
		this.idTipFactura = idTipFactura;
		this.apartamentList = apartamentList;
	}

	public Long getIdFactura() {
		return idFactura;
	}
	
	public TipFactura getIdTipFactura() {
		return idTipFactura;
	}
	
	public List<Apartament> getApartamentList() {
		return apartamentList;
	}
	
	public void setIdFactura(Long idFactura) {
		this.idFactura = idFactura;
	}
	
	public void setIdTipFactura(TipFactura idTipFactura) {
		this.idTipFactura = idTipFactura;
	}
	
	public void setApartamentList(List<Apartament> apartamentList) {
		this.apartamentList = apartamentList;
	}
	
}
