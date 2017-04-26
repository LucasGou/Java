package gestionvelo;

import java.util.ArrayList;
import java.util.List;

public class locations {
int id_mag;
List<location> listelocation = new ArrayList<location>();

public locations(int v_nommag) {
	super();
	this.id_mag=v_nommag;
}

public locations(List<location> listelocation) {
	super();
	this.listelocation = listelocation;
}

public void ajouter(location unelocation){
	listelocation.add(unelocation);
}

public void liste(){
	System.out.println("***************************");
	System.out.println(id_mag);
	for(location l:listelocation){
		l.donnelocation();
	}
}

public void donnemagasin(){
	System.out.println(id_mag);
}

}
