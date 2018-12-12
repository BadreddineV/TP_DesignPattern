package interpreteur;
import appli.*;

import java.util.ArrayList;

//@SuppressWarnings({ "unused", "hiding" })
@SuppressWarnings("unused")
public class Adaptateur extends Media {
	SupportDeComm s;
	
	public Adaptateur(SupportDeComm s,int d, String nom) {
		super (d,nom); 
		this.s = s ;
		
	}

	public String getAuteur() {
		
		return s.getAuteur();
	}

	@Override
	public String getTexte() {
		return s.getTexte();
	}

	@Override
	protected int getNombreDePhotos() {
		return 0;
	}

}
