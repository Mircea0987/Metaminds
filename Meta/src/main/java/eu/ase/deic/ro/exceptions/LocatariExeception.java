package eu.ase.deic.ro.exceptions;

public class LocatariExeception extends RuntimeException {

	public LocatariExeception(Long id) {
		super("Locatar with id " + id + " not found!");
	}
}
