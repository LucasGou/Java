package entites.common;

import entites.client.common;

public class fl extends article implements common{
boolean mure;
String famille;

public fl(int peremption, String nom, boolean mure, String famille) {
	super(peremption, nom);
	this.mure = mure;
	this.famille = famille;
}

public fl(int peremption, String nom) {
	super(peremption, nom);
}


public void afficherarticle(){
super.afficherarticle();
System.out.println("il est actuellement"+ ((mure == true) ? " mure ":" pourris ") +"et fais parti de la famille "+ famille);
	}


}
