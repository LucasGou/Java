package gestionvelo;

import java.util.Scanner;

public class menuprincipal {

	public static void main(String[] tableaunom,int [] tableaujours,boolean [] tableautf,byte[] tableautype, String[] tableaucouleurs, int COLONNE_MAX) {
	//public static void main(Location l, int COLONNE_MAX) {
		System.out.println("-----MENU-----");
		System.out.println("Afficher Stock/réservation : tapez 1");
		System.out.println("Enregistrer réservation : tapez 2");
		System.out.println("Supprimer réservation : tapez 3");
		System.out.println("Quitter : tapez 4");
		Scanner menu = new Scanner(System.in);
		int choixmenu = menu.nextInt();
		
		// AFFICHAGE
		if (choixmenu ==1){
			//On passe des tableaux ?
			//menu1.main(l.getNom(),l.getJours(),l.isLoue(),l.getType(),l.getCouleur(), COLONNE_MAX);
			menu1.main(tableaunom,tableaujours,tableautf,tableautype,tableaucouleurs,COLONNE_MAX);
		}
		
		if (choixmenu == 2){
			menu2.main(tableaunom,tableaujours,tableautf,tableautype,COLONNE_MAX);
		}
		
		/*if (choixmenu == 3){
			menu2.main(tableaunom,tableaujours,tableautf,tableautype,COLONNE_MAX);
		}*/
		
		if (choixmenu == 4){
			System.exit(0);
		}
	}
}
