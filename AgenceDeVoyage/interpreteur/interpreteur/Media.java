package interpreteur;

import java.util.Calendar;
import java.util.Date;

@SuppressWarnings("unused")
public abstract class Media {
    protected int annee ;
    protected String nom ;

    protected Media(int a, String nom) {
        this.annee = a;
        this.nom = nom;
    }

	protected abstract String getAuteur();

	protected abstract String getTexte();

	public abstract int getNombreDePhotos();

    
}
