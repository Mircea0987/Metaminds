package eu.ase.deic.ro.models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Apartament {

	@Id
	private Long id;
	private String[] descriere;
	private Long idProprietar;
	private int numarulApartamentelor;
	private int etaj;
	private Camera id_camera;
	private List<Camera> listaCamera;
	private List<Recenzie> recenzieList;
	private List<Apartamente_Locatari> apartamenteLcoatari;
	private Recenzie idRecenzie;
	private Factura idFactura;
	
	
	
	public Apartament(Long id, String[] descriere, Long idProprietar, int numarulApartamentelor, int etaj,
		Camera id_camera, List<Camera> listaCamera, List<Recenzie> recenzieList,
		List<Apartamente_Locatari> apartamenteLcoatari, Recenzie idRecenzie, Factura idFactura) {
		this.id = id;
		this.descriere = descriere;
		this.idProprietar = idProprietar;
		this.numarulApartamentelor = numarulApartamentelor;
		this.etaj = etaj;
		this.id_camera = id_camera;
		this.listaCamera = listaCamera;
		this.recenzieList = recenzieList;
		this.apartamenteLcoatari = apartamenteLcoatari;
		this.idRecenzie = idRecenzie;
		this.idFactura = idFactura;
	}
	public Long getId() {
		return id;
	}
	public String[] getDescriere() {
		return descriere;
	}
	public Long getIdProprietar() {
		return idProprietar;
	}
	public int getNumarulApartamentelor() {
		return numarulApartamentelor;
	}
	public int getEtaj() {
		return etaj;
	}
	public Camera getId_camera() {
		return id_camera;
	}
	public List<Camera> getListaCamera() {
		return listaCamera;
	}
	public List<Recenzie> getRecenzieList() {
		return recenzieList;
	}
	public List<Apartamente_Locatari> getApartamenteLcoatari() {
		return apartamenteLcoatari;
	}
	public Recenzie getIdRecenzie() {
		return idRecenzie;
	}
	public Factura getIdFactura() {
		return idFactura;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setDescriere(String[] descriere) {
		this.descriere = descriere;
	}
	public void setIdProprietar(Long idProprietar) {
		this.idProprietar = idProprietar;
	}
	public void setNumarulApartamentelor(int numarulApartamentelor) {
		this.numarulApartamentelor = numarulApartamentelor;
	}
	public void setEtaj(int etaj) {
		this.etaj = etaj;
	}
	public void setId_camera(Camera id_camera) {
		this.id_camera = id_camera;
	}
	public void setListaCamera(List<Camera> listaCamera) {
		this.listaCamera = listaCamera;
	}
	public void setRecenzieList(List<Recenzie> recenzieList) {
		this.recenzieList = recenzieList;
	}
	public void setApartamenteLcoatari(List<Apartamente_Locatari> apartamenteLcoatari) {
		this.apartamenteLcoatari = apartamenteLcoatari;
	}
	public void setIdRecenzie(Recenzie idRecenzie) {
		this.idRecenzie = idRecenzie;
	}
	public void setIdFactura(Factura idFactura) {
		this.idFactura = idFactura;
	}
	
	
	
	
	
}
