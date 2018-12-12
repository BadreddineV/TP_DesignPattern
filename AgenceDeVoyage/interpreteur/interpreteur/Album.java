package interpreteur;

import java.util.ArrayList;
import java.util.Iterator;

public class Album extends Media implements Iterable<Media>{
    protected ArrayList<Media> als ;
    public Album(int d, String nom) {
        super(d, nom);
        this.als = new ArrayList<>(10);
    }

    public void ajouter(Media... s) {
        for (Media sc : s)
            this.als .add(sc) ;
    }
    

    public String toString() {
        return "Album{" +
                "als=" + als +
                '}';
    }

    
    public Iterator<Media> iterator() {
        return this.als.iterator();
    }


    public int getNombreDePhotos(){
        int count=0;
    	for (Media sc :als) {
        	count=count+ sc.getNombreDePhotos();
        }
    	return count;
    	//return this.als.size();
    }

	public String getTexte() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getAuteur() {
		// TODO Auto-generated method stub
		return null;
	}
}