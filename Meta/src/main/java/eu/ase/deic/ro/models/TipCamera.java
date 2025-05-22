package eu.ase.deic.ro.models;

public class TipCamera {
	
	private Long idTipCamera;
	private String[] descriere;
	
	
	
	public TipCamera(Long idTipCamera, String[] descriere) {
		this.idTipCamera = idTipCamera;
		this.descriere = descriere;
	}
	
	public Long getIdTipCamera() {
		return idTipCamera;
	}
	
	public String[] getDescriere() {
		return descriere;
	}
	
	public void setIdTipCamera(Long idTipCamera) {
		this.idTipCamera = idTipCamera;
	}
	
	public void setDescriere(String[] descriere) {
		this.descriere = descriere;
	}
	
	
	
	
}
