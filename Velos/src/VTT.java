public class VTT extends velo {
	boolean fourchearriere;

	public VTT(String couleurs,String type) {
		super(couleurs, type);
	}

	
	public VTT(String couleurs, int roues, boolean fourche, String type) {
		super(couleurs, roues, fourche, type);
	}

	public VTT(String couleurs, int roues, boolean fourche, String type, boolean fourchearriere) {
		super(couleurs, roues, fourche, type);
		this.fourchearriere = fourchearriere;
	}

	public boolean isFourchearriere() {
		return fourchearriere;
	}

	public void setFourchearriere(boolean fourchearriere) {
		this.fourchearriere = fourchearriere;
	}
	
	public void afficher() {
		//super.affichervelo();
		System.out.println("Le VTT est"+((fourchearriere == true) ? " avec ":" sans ")+"fourche arriere.");
	}
}
