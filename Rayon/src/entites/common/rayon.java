package entites.common;
import java.util.ArrayList;
import java.util.List;

public class rayon {
	int id_rayon;
	List<article> listearticles = new ArrayList<article>();

public rayon() {
	super();
}

public rayon(List<article> listearticles) {
	super();
	this.listearticles = listearticles;
}

public void ajouteraurayon(article emplacement){
	listearticles.add(emplacement);
}

public int getId_rayon() {
	return id_rayon;
}

public void setId_rayon(int id_rayon) {
	this.id_rayon = id_rayon;
}

public void afficher(){
	System.out.println("Rayon numero "+id_rayon);
	for (article a:listearticles){
		a.afficherarticle();
		}
	}
}
