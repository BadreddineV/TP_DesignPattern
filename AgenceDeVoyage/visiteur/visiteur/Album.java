package visiteur;

import java.util.ArrayList;
import java.util.Iterator;

/*import interpreteur.Media;
import interpreteur.Video;
*/
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


    @Override
    public String toString() {
        return "Album{" +
                "als=" + als +
                '}';
    }

    @Override
    public Iterator<Media> iterator() {
        return this.als.iterator();
    }

    public void accept(Visiteur v) {
    	//int countPhoto = 0;	
    	//Media s;
    	//v.visit(this);
    	for (Media s : als) {
    		v.visit(s);
        }
    	//return this.getNombreDePhotos();
    	//return countPhoto;
    }

	

}