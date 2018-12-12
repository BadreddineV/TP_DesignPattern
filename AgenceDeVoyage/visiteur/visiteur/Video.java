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
	public String getFichier() {
		return nomFichier;
	}

	public void accept(Visiteur v) {
    	v.visit(this);
    	}
	

	protected String getAuteur() {
		return nomAuteur;
	}
	@Override
	protected String getTexte() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int getNombreDePhotos() {
		// TODO Auto-generated method stub
		return 0;
	}

}
