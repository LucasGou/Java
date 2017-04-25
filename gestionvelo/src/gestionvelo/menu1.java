package gestionvelo;

public class menu1 {
	public static void main(String[] tableaunom,int [] tableaujours,boolean [] tableautf,byte[] tableautype,String[] tableaucouleurs, int COLONNE_MAX) {
		for (int i=0; i<COLONNE_MAX; i++){
			System.out.println(tableaunom[i]+" "+tableaujours[i]+" "+tableautf[i]+" "+tableautype[i]+" "+tableaucouleurs[i]);
		}
		String[] restart = new String[0];
		main.main(restart);
	}

}