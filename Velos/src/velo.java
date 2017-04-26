
public class velo {
String couleurs;
int roues;
boolean fourche;
String type;
int taille;

public velo(String couleurs, String type) {
	super();
	this.couleurs = couleurs;
	this.type = type;
}

public velo(String couleurs, int roues, boolean fourche, String type) {
	super();
	this.couleurs = couleurs;
	this.roues = roues;
	this.fourche = fourche;
	this.type = type;
}

public void affichervelo() {
	System.out.println("Le velo est "+couleurs+" avec "+roues+" roues et de type "+type+((fourche == true) ? " avec ":" sans ")+"fourche");
}

public int getTaille() {
	return taille;
}

public void setTaille(int taille) {
	this.taille = taille;
}




}
