package visiteur;
import appli.*;



public class Adaptateur extends Media {
	SupportDeComm s;
	int date;
	String name; 
	
	public Adaptateur(SupportDeComm s,int d, String nom) {
		super(d,nom);
		date = d;
		name =nom;
		this.s=s;
	}
	
	public void accept(Visiteur v) {
    	v.visit(this);
    	}
	
	public String getNom() {
		return super.nom;
	}
	public int getDate() {
		return super.annee;
	}
	public String getAuteur() {
		return super.getAuteur();
	}
	public String getFichier() {
		return s.getFichier();
	}
	public String getTexte() {
		return s.getTexte();
	}
}
