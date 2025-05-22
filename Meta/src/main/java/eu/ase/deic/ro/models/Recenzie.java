package eu.ase.deic.ro.models;

import java.time.LocalDate;

public class Recenzie {

	private Long idRecenzie;
	private String[] comentariu;
	private int rating;
	private LocalDate data;
	private Apartament idApartament;
		
	public Recenzie(Long idRecenzie, String[] comentariu, int rating, LocalDate data, Apartament idApartament) {
		this.idRecenzie = idRecenzie;
		this.comentariu = comentariu;
		this.rating = rating;
		this.data = data;
		this.idApartament = idApartament;
	}

	public Long getIdRecenzie() {
		return idRecenzie;
	}
	
	public String[] getComentariu() {
		return comentariu;
	}
	
	public int getRating() {
		return rating;
	}
	
	public LocalDate getData() {
		return data;
	}
	
	public Apartament getIdApartament() {
		return idApartament;
	}
	
	public void setIdRecenzie(Long idRecenzie) {
		this.idRecenzie = idRecenzie;
	}
	
	public void setComentariu(String[] comentariu) {
		this.comentariu = comentariu;
	}
	
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	public void setData(LocalDate data) {
		this.data = data;
	}
	
	public void setIdApartament(Apartament idApartament) {
		this.idApartament = idApartament;
	}
	
	
	
}
