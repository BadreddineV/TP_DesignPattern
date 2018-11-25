package visiteur;

import java.util.Calendar;
import java.util.Date;

import interpreteur.Video;

@SuppressWarnings("unused")
public class Main {
    public static void main(String[] args) {
        Album al = new Album(2018, "Album Senja");
        Photo p1  = new Photo(2018, "Aurore Boréale", "JMP", "Photo1.jpg");
        Photo p2  = new Photo(2018, "Trek", "JMP", "Photo2.jpg");
        Photo p3  = new Photo(2018, "Fjord", "SM", "Photo3.jpg");
        al.ajouter(p1, p2, p3);

        String res = "Album{als=[Photo{auteur='JMP', annee=2018, nom='Aurore Boréale'}, Photo{auteur='JMP', annee=2018, nom='Trek'}, Photo{auteur='SM', annee=2018, nom='Fjord'}]}";
        assert (al.toString().equals(res)) : "Bug" ;
        Video v1= new Video(2018,"Album Name" ,"Name fichier1","Auteur1");
        System.out.print(v1.getnomFichier());
        VisitNbPhotos v = new VisitNbPhotos ();
        
        v.visit(al);
        v.visit(p1);
        v.getNombreDePhotos(al);
        //v.getterVideo(v1);
        
        
        
        
    }
}