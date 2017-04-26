import entites.boissons.boissons;
import entites.common.article;
import entites.common.fl;
import entites.common.rayon;
import entites.poisson.poisson;

public class main {

	public static void main(String[] args) {
		
		/*boissons b1 = new boissons (19, "Coca", true, 10);
		b1.afficherarticle();*/
		
		fl fl1 = new fl (28, "Concombre", true, "Legumes");
		/*fl1.afficherarticle();*/
		
		/*poisson p1 = new poisson (5,"Crustaces",true,"Crevettes");
		p1.afficherarticle();*/
		
		rayon r1 = new rayon ();
		r1.setId_rayon(145);
		r1.ajouteraurayon(fl1);
		r1.afficher();
		

	}

}
