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
		return super.nom;
	}
	public int getDate() {
		return super.annee;
	}
	
	public String getFichier() {
		return s.getFichier();
	}
	public String getTexte() {
		return s.getTexte();
	}

	@Override
	public int getNombreDePhotos() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	/*
	public String getAuteur() {
		
		return super.getAuteur();
	}

	@Override
	public String getTexte() {
		return s.getTexte();
	}

	@Override
	public int getNombreDePhotos() {
		return 0;
	}
*/
}
