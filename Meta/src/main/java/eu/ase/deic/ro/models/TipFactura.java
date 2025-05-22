package eu.ase.deic.ro.models;

import java.util.List;

public class TipFactura {

	private Long idTipFactura;
	private String[] descriere;
	private List<Factura> facturiList;
		
	public TipFactura(Long idTipFactura, String[] descriere, List<Factura> facturiList) {
		this.idTipFactura = idTipFactura;
		this.descriere = descriere;
		this.facturiList = facturiList;
	}

	public Long getIdTipFactura() {
		return idTipFactura;
	}
	
	public String[] getDescriere() {
		return descriere;
	}
	
	public List<Factura> getFacturiList() {
		return facturiList;
	}
	
	public void setIdTipFactura(Long idTipFactura) {
		this.idTipFactura = idTipFactura;
	}
	
	public void setDescriere(String[] descriere) {
		this.descriere = descriere;
	}
	
	public void setFacturiList(List<Factura> facturiList) {
		this.facturiList = facturiList;
	}
	
	
	
}
