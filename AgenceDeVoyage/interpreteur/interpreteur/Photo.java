package interpreteur;



public class Photo extends Media {
    protected String auteur;
    protected String nomFichier;
    protected int count;
    public Photo(int d, String nom, String auteur, String nomFichier) {
        super(d, nom);
        this.auteur = auteur;
        this.nomFichier = nomFichier;
        //count = count +1;
        count = 1;
    }

    @Override
    public String toString() {
        return "Photo{" +
                "auteur='" + auteur + '\'' +
                ", annee=" + annee +
                ", nom='" + nom + '\'' +
                '}';
    }

	@Override
	protected String getAuteur() {
		return auteur;
	}

	@Override
	protected String getTexte() {
		return null;
	}
	protected int getNombreDePhotos(){
		return count;
	}
}
