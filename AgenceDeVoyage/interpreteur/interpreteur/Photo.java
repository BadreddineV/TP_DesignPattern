package interpreteur;



public class Photo extends Media {
    protected String auteur;
    protected String nomFichier;
    public Photo(int d, String nom, String auteur, String nomFichier) {
        super(d, nom);
        this.auteur = auteur;
        this.nomFichier = nomFichier;
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
		// TODO Auto-generated method stub
		return null;
	}
}
