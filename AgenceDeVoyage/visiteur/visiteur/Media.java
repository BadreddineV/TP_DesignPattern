package visiteur;

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

    public void accept(Visiteur v) {
	}

	public int getNombreDePhotos() {
		return 0;
	}

	
	public String getAuteur() {
		 
		return nom;
	}
	public int getDate() {
		return annee;
	}

	public String getTexte() {
		// TODO Auto-generated method stub
		return null;
	}


}

