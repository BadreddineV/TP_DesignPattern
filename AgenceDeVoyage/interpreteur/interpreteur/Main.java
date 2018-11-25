package interpreteur;

import java.util.Calendar;
import java.util.Date;

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
        System.out.println(al.getNombreDePhotos());
        Video v1= new Video(2018,"Album Name" ,"Name fichier1","Auteur1");
        System.out.println("Nom film: "+ v1.getnomFichier() + " nom Auteur: " + v1.getNomAuteur());
        
        Article a = new Article (2016,"NR","Le pouvoir d'achat est pertinant", "isabelle");
        Article a1 = new Article (2016,"NMR","Le pouvoir d'achat n'est pertinant", "mirabelle");
        //public Article(int d,String nom,String T,String auteur) 
        System.out.println(a.getNomAuteur());
        
        al.ajouter(a,a1);
        System.out.println(al.getNombreDePhotos());
        System.out.println(al.researchText("isabelle",al));
       
    }
}
