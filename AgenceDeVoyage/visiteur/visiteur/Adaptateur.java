package visiteur;

import java.util.ArrayList;

@SuppressWarnings("unused")
public class Adaptateur extends Media {
	//SupportDeComm s;
	
	public Adaptateur(int d, String nom) {
		super(d,nom);
		//this.s=s;
	}
	
	public void accept(Visiteur v) {
    	v.visit(this);
    	}

	
}
