package fr.douviz.ocr_part1.patternStrategy;

public class Guerrier extends Personnage {
	public Guerrier() {
		this.espritCombatif = new CombatPistolet();
	}

	public Guerrier(EspritCombatif esprit, Soin soin, Deplacement dep) {
		super(esprit, soin, dep);
	}
}
