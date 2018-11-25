package interpreteur;

public class Video extends Media {
	protected String nomFichier;
	protected String auteur;
	public Video(int d,String nom, String nF,String auteur) {
		super(d, nom);
		this.nomFichier = nF;
		this.auteur = auteur;
	}
	public String getnomFichier() {
		return nomFichier;
	}
	
	
	public void ConsulterVideo() {}
	@Override
	protected String getNomAuteur() {
		return auteur;
	}
	@Override
	protected String getTexte() {
		// TODO Auto-generated method stub
		return null;
	}

}
