package fr.douviz.ocr_part1.inheritance;

import fr.douviz.ocr_part1.exceptions.NomVilleException;
import fr.douviz.ocr_part1.exceptions.NombreHabitantException;

public class Capitale extends Ville {

	private String monument;

	// Constructeur par d�faut
	public Capitale() {
		// Ce mot cl� appelle le constructeur de la classe m�re
		super();
		monument = "aucun";
	}

	// Constructeur d'initialisation de capitale
	public Capitale(String nom, int hab, String pays, String monument) throws NombreHabitantException, NomVilleException {
		super(nom, hab, pays);
		this.monument = monument;
	}

	/**
	 * Description d'une capitale
	 * 
	 * @return String retourne la description de l'objet
	 */
	@Override
	public String toString() {
		String str = super.toString() + "\n \t ==>>" + this.monument + " en est un monument";
		return str;
	}

	/**
	 * @return le nom du monument
	 */
	public String getMonument() {
		return monument;
	}

	// D�finit le nom du monument
	public void setMonument(String monument) {
		this.monument = monument;
	}
}