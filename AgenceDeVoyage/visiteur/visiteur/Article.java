package visiteur;

public class Article extends Media {
	String text;
	String nomAuteur;
	public Article(int d,String nom,String T, String nA) {
		super(d, nom);
		this.text = T;
		this.nomAuteur = nA;
	}
	
	public String getTexte() {
		return text;
	}
	public String getAuteur() {
		return nomAuteur;
	}
	public void accept(Visiteur v) {
    	v.visit(this);
    	}

}
