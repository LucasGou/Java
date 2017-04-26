package entites.common;

import java.util.List;

import entites.client.common;

public class article extends rayon implements common {
int peremption;
String nom;

public article() {
	super();
}

public article(int peremption, String nom) {
	super();
	this.peremption = peremption;
	this.nom = nom;
}

public void afficherarticle(){
System.out.print("La date de peremption est le "+ peremption +" pour le produit "+ nom + " ");
	}
}
