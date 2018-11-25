package visiteur;

import interpreteur.Media;

public class Video extends Media {
	protected String nomFichier;
	protected String nomAuteur;
	public Video(int d,String nom, String nF,String nA) {
		super(d, nom);
		this.nomAuteur = nA;
		this.nomFichier = nF;
	}
	public String getnomFichier() {
		return nomFichier;
	}
	
	public String getnomAuteur() {
		return nomAuteur;
	}
	public void accept(Visiteur v) {
    	v.visit(this);
    	}

}
