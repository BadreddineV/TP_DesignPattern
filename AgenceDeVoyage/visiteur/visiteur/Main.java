package visiteur;

import java.util.Calendar;
import java.util.Date;

import appli.SupportDeComm;
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
        //System.out.print(v1.getnomFichier());
        VisitNbPhotos v = new VisitNbPhotos ();
        
        Photo p4  = new Photo(2018, "Fjord", "SM", "Photo3.jpg");
        Article A1 = new Article (2001,"Mike"," Votre parole est d'or"," Or");
        al.ajouter((A1));
        al.ajouter(p4);
        v.visit(al);
        System.out.print("test de la deuxieme partie");
        v.visit(A1);
        v.visit(p1);
        v.visit(p2);
        v.visit(p3);
        v.getNombreDePhotos();
        v.getNombreDeVideos();
        v.getNombreDeArticles();
        v.visit(A1);
        v.getArticle(A1);
        
        SupportDeComm s = new SupportDeComm("James","File1",1997,"La fable est ironique");
        Adaptateur adp = new Adaptateur(s,2003,"Mario");
        v.visit(adp);
        //v.getNombreDeAdaptateur();
        //v.getFichier(adp);
        v.getAdaptateur(adp);

        
        
        //v.visit(p1);
        //v.getNombreDePhotos(al);
        //v.getterVideo(v1);
        /*
        al.ajouter(p4);
        System.out.print("Test 1 : du nombre du nombre de photo dans l'album: ");
        System.out.println(al.getNombreDePhotos());
        */
        
    }
}
