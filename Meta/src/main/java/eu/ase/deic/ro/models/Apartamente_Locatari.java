package eu.ase.deic.ro.models;

public class Apartamente_Locatari {

	private Apartament idApartament;
	private Locatar idLocatar;
	
	public Apartamente_Locatari(Apartament idApartament, Locatar idLocatar) {
		this.idApartament = idApartament;
		this.idLocatar = idLocatar;
	}

	public Apartament getIdApartament() {
		return idApartament;
	}
	
	public Locatar getIdLocatar() {
		return idLocatar;
	}
	
	public void setIdApartament(Apartament idApartament) {
		this.idApartament = idApartament;
	}
	
	public void setIdLocatar(Locatar idLocatar) {
		this.idLocatar = idLocatar;
	}
	
	
	
}
