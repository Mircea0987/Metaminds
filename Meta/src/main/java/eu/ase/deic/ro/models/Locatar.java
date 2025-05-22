package eu.ase.deic.ro.models;

import java.util.List;

public class Locatar {
	
	private Long idLocatar;
	private List<Inchiriere> inchirieriList;
	
	public Locatar(Long idLocatar, List<Inchiriere> inchirieriList) {
		this.idLocatar = idLocatar;
		this.inchirieriList = inchirieriList;
	}

	public Long getIdLocatar() {
		return idLocatar;
	}
	
	public List<Inchiriere> getInchirieriList() {
		return inchirieriList;
	}
	
	public void setIdLocatar(Long idLocatar) {
		this.idLocatar = idLocatar;
	}
	
	public void setInchirieriList(List<Inchiriere> inchirieriList) {
		this.inchirieriList = inchirieriList;
	}
	
	

}
