package gestionvelo;

import java.util.ArrayList;
import java.util.List;

public class femmes {
List<femme> listefemme = new ArrayList<femme>();



public femmes() {
	super();
}

public femmes(List<femme> listefemme) {
	super();
	this.listefemme = listefemme;
}

public void ajouter(femme unefemme){
	listefemme.add(unefemme);
}

public void liste(){
	for(femme f:listefemme){
		f.donnetesyeux();
	}
}
}
