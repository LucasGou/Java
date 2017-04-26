package gestionvelo;

public class location {
String nom;
int jours;
boolean loue;
int type;
String couleurs;

public location(String nom, int jours, boolean loue, int type, String couleurs) {
	super();
	this.nom = nom;
	this.jours = jours;
	this.loue = loue;
	this.type = type;
	this.couleurs = couleurs;
}

public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}

public int getJours() {
	return jours;
}

public void setJours(int jours) {
	this.jours = jours;
}

public boolean isLoue() {
	return loue;
}

public void setLoue(boolean loue) {
	this.loue = loue;
}

public int getType() {
	return type;
}

public void setType(int type) {
	this.type = type;
}

public String getCouleurs() {
	return couleurs;
}

public void setCouleurs(String couleurs) {
	this.couleurs = couleurs;
}

public void donnelocation(){
	System.out.println(nom +" "+jours+" "+couleurs);
}



}
