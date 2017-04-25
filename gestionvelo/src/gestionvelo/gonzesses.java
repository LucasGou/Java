package gestionvelo;

public class gonzesses {

	public static void main(String[] args) {
		femme natacha = new femme("Natacha",18,"Bleus",true);
		femme megane = new femme("Megane",20,"Vert",false);
	
		femmes amies = new femmes();
			amies.ajouter(megane);
			amies.ajouter(natacha);
			amies.liste();
		
	}

}
