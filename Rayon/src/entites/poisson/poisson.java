package entites.poisson;

import entites.client.common;
import entites.client.typeboisson;
import entites.common.article;

public class poisson extends article implements common {
	boolean frais;
	String nompoisson;
	
	public poisson(int peremption, String nom, boolean frais, String nompoisson) {
		super(peremption, nom);
		this.frais = frais;
		this.nompoisson = nompoisson;
	}
	
	public void afficherarticle(){
		super.afficherarticle();
		System.out.println(" il est "+((frais == true) ? " frais ":" pas frais ")+ "et c'est des " +nompoisson+ " ");
			}

}
