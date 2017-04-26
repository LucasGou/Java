package gestionvelo;

import java.util.ArrayList;
import java.util.List;

public class magasins {
	List<locations> listemagasin = new ArrayList<locations>();
	
	public magasins() {
		super();
	}
	
	public magasins(List<locations> listemagasin) {
		super();
		this.listemagasin = listemagasin;
	}

	public void ajouter(locations unmagasin){
		listemagasin.add(unmagasin);
	}
	
	public void liste(){
		for(locations ls:listemagasin){
			ls.donnemagasin();
			ls.liste();
		}
	}
}
