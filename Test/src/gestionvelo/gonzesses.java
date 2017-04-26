package gestionvelo;

public class gonzesses {

	public static void main(String[] args) {
		femme natacha = new femme("Natacha",18,"Bleus",true);
		femme megane = new femme("Megane",20,"Vert",false);
		femme veronique = new femme ("Veronique",50,"Jaune",true);
	
		femmes amies = new femmes();
			amies.ajouter(megane);
			amies.ajouter(natacha);
			amies.ajouter(veronique);
			amies.liste();
		
	}

}
