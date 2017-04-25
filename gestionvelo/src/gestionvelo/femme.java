package gestionvelo;

public class femme {
	String nom;
	int age;
	String couleuryeux;
	boolean celib;
	
	
	public femme(String nom, int age, String couleuryeux, boolean celib) {
		super();
		this.nom = nom;
		this.age = age;
		this.couleuryeux = couleuryeux;
		this.celib = celib;
	}
	
	public void donnetonnom (){
		System.out.println(nom);
	}
	
	public void donnetesyeux(){
		System.out.println(nom + " a les yeux " + couleuryeux.toUpperCase());
	}

	public String getCouleuryeux() {
		return couleuryeux;
	}

	public void setCouleuryeux(String couleuryeux) {
		this.couleuryeux = couleuryeux;
	}
	
	
	
	

}
