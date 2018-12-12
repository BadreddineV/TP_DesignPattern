package interpreteur;

public class Article extends Media {
	public String text;
	public String auteur;
	public Article(int d,String nom,String T,String auteur) {
		super(d, nom);
		this.text = T;
		this.auteur = auteur;
	}
	
	public String getTexte() {
		return text;
	}
	
	public String getAuteur() {
		return auteur;
	}

	@Override
	public int getNombreDePhotos() {
		return 0;
	}
	
}
