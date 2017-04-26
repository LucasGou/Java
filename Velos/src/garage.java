import java.util.ArrayList;
import java.util.List;

public class garage {
List<velo> listevelo = new ArrayList<velo>();

public garage() {
	super();
}

public garage(List<velo> listevelo) {
	super();
	this.listevelo = listevelo;
}

public void ajouter(velo unvelo){
	listevelo.add(unvelo);
}

public void afficher(){
	for (velo v:listevelo){
		v.affichervelo();
	}
}

}
