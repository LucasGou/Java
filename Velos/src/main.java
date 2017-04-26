
public class main {

	public static void main(String[] args) {

		//velo v1= new velo("vert", 2, false, "enfant");
		//velo v2= new velo("bleu", 1, true, "VTT");
		
		//garage g1 = new garage();
		//g1.ajouter(v1);
		//g1.ajouter(v2);
		//g1.afficher();
		
		VTT vtt1= new VTT("vert","enfant");
		vtt1.afficher();
		vtt1.affichervelo();
		
		vtt1.setTaille(10);
		System.out.println(vtt1.getTaille());
		
	}

}
