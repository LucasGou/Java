package gestionvelo;

import java.util.ArrayList;
import java.util.List;

public class main {
	
	
	public static void main(String[] args) {
		location l1 = new location("Montagne",25,true,1,"Bleu");
		location l2 = new location("Course",2,false,2,"Vert");
		
		/***********************************************/
		locations loca = new locations(1);
		loca.ajouter(l2);
		loca.ajouter(l1);

		/***********************************************/
		
		locations loca2 = new locations(2);
		l1.setCouleurs("Rouge");
		l2.setCouleurs("Rouge");
		loca2.ajouter(l2);
		loca2.ajouter(l1);
		
		
		/*************************************************/
		magasins m1 = new magasins();
		m1.ajouter(loca2);
		m1.ajouter(loca);
		m1.liste();
	}
	
		
}
