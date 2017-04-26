package entites.boissons;

import entites.client.common;
import entites.client.typeboisson;
import entites.common.article;

public class boissons extends article implements common { //implements typeboisson

	boolean petillant;
	String litre;
	
	public boissons() {
	}
	
	public void afficherarticle(){
		super.afficherarticle();
		System.out.println(", il est"+((petillant == true) ? " petillant ":" non petillant ")+ "et contient " +litre+ " Litres ");
			}
}
