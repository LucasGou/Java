package gestionvelo;

import java.util.Scanner;

public class menu2 {

	public static void main(String[] tableaunom,int [] tableaujours,boolean [] tableautf,byte[] tableautype, int COLONNE_MAX) {
		
		boolean res = false;
		for (int i=0; i<COLONNE_MAX; i++){
			if (tableautf[i]==false){
				res = true;
			}
		}

		if (res){
			System.out.println("Emplacement disponible !");
			System.out.println("Quel emplacement ? entre 1 et " + COLONNE_MAX);
			Scanner emplacement = new Scanner(System.in);
			int numtab = emplacement.nextInt();
			if (tableautf[numtab-1] == true){
				System.out.println("Deja réservé !");
				String[] restart = new String[0];
				main.main(restart);
			}
			else{
				System.out.println("reservable !");
				
				System.out.println("Quel types de vélos voulez vous ?");
				System.out.println("Montagne : tapez 1");
				System.out.println("Course : tapez 2");
				System.out.println("Enfant : tapez 3");
				Scanner type = new Scanner(System.in);
				String choixvelo = type.nextLine();
			
				System.out.println("Quel est votre nom ?");
				Scanner name = new Scanner(System.in);
				String nom = name.nextLine();
				
			
				System.out.println("Pour combien de jour voulez vous louer ?");
				Scanner location = new Scanner(System.in);
				String nbjours = location.nextLine();
			
				tableaunom[numtab-1]=nom;
				tableaujours[numtab-1]=Integer.parseInt(nbjours);
				tableautype[numtab-1]=Byte.parseByte(choixvelo);
				tableautf[numtab-1]=true;
				
				System.out.println("Merci, réservation enregistrée");
				String[] restart = new String[0];
				main.main(restart);
			}
		} else {
			System.out.println("Aucun emplacement de disponible !");
			String[] restart = new String[0];
			main.main(restart);
		}

	}

}
