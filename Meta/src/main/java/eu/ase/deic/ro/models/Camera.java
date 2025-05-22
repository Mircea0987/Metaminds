package eu.ase.deic.ro.models;

import java.util.List;

public class Camera {

	private Long idCamera;
	private String tipulCamerei;
	private List<TipCamera> listTipCamera;
	private Apartament idApartament;
	private double pretLunar;
	private boolean esteDisponibil;
	private double dimensiune;
	
	
	
	public Camera(Long idCamera, String tipulCamerei, List<TipCamera> listTipCamera, Apartament idApartament,
		double pretLunar, boolean esteDisponibil, double dimensiune) {
		this.idCamera = idCamera;
		this.tipulCamerei = tipulCamerei;
		this.listTipCamera = listTipCamera;
		this.idApartament = idApartament;
		this.pretLunar = pretLunar;
		this.esteDisponibil = esteDisponibil;
		this.dimensiune = dimensiune;
	}
	public Long getIdCamera() {
		return idCamera;
	}
	public String getTipulCamerei() {
		return tipulCamerei;
	}
	public List<TipCamera> getListTipCamera() {
		return listTipCamera;
	}
	public Apartament getIdApartament() {
		return idApartament;
	}
	public double getPretLunar() {
		return pretLunar;
	}
	public boolean isEsteDisponibil() {
		return esteDisponibil;
	}
	public double getDimensiune() {
		return dimensiune;
	}
	public void setIdCamera(Long idCamera) {
		this.idCamera = idCamera;
	}
	public void setTipulCamerei(String tipulCamerei) {
		this.tipulCamerei = tipulCamerei;
	}
	public void setListTipCamera(List<TipCamera> listTipCamera) {
		this.listTipCamera = listTipCamera;
	}
	public void setIdApartament(Apartament idApartament) {
		this.idApartament = idApartament;
	}
	public void setPretLunar(double pretLunar) {
		this.pretLunar = pretLunar;
	}
	public void setEsteDisponibil(boolean esteDisponibil) {
		this.esteDisponibil = esteDisponibil;
	}
	public void setDimensiune(double dimensiune) {
		this.dimensiune = dimensiune;
	}
	
	
	
	
}
