package interpreteur;

import java.util.ArrayList;

@SuppressWarnings("unused")
public class Adaptateur<SupportDeComm> extends Media {
	SupportDeComm s;
	
	public Adaptateur(int d, String nom) {
		super(d,nom);
		//this.s=s;
	}

	public String getAuteur() {
		
		return ((Media) s).getAuteur();
	}

	@Override
	public String getTexte() {
		return ((Media) s ).getTexte();
	}

}
