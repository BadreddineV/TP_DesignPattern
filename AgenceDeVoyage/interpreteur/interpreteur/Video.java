package interpreteur;

public class Video extends Media {
	protected String nomFichier;
	protected String auteur;
	protected String format;
	public Video(int d,String nom, String nF,String auteur) {
		super(d, nom);
		this.nomFichier = nF;
		this.auteur = auteur;
	}
	public String getnomFichier() {
		return nomFichier;
	}
	
	/*Question 7 : Consulter des videos sous format mp4*/
	public void ConsulterVideo() {
		
	}
	@Override
	public String getAuteur() {
		return auteur;
	}
	@Override
	public String getTexte() {
		// TODO Auto-generated method stub
		return null;
	}
	public int getNombreDePhotos(){
		return 0;
	}
	public String getFormat() {
		return format;
	}

}
