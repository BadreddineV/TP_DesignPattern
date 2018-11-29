package visiteur;


public class VisitNbPhotos implements Visiteur {

	public VisitNbPhotos() {
		
	}

	@Override
	public void visit(Album a) {
		System.out.println("Visiting Album");
		
	}

	@Override
	public void visit(Photo p) {
		System.out.println("Visiting Photo");
		
	}
	
	public void visit(Video v) {
		System.out.println("Visiting Video");
		
	}
	
	@Override
	public void visit(Article a) {
		System.out.println("Visiting Article");
		
	}
	
	@Override
	public void getNombreDePhotos(Album a) {
		System.out.println(a.getNombreDePhotos());
		
	}
	
	public void getterVideo(Video v1) {
		System.out.println(" nom fichier: " +v1.getnomFichier());
		System.out.println(" nom Auteur " +v1.getnomAuteur());
		
	}
	/* Question 7: Consulter le texte d'un auteur donné . */
	public void getterArticle(Article a) {
		System.out.println(" texte Article: " +a.getTexte());
		System.out.println("Auteur article: " +a.getNomAuteur());
		
	}

	@Override
	public void getTexte(Article a) {
		// TODO Auto-generated method stub
		
	}
	
	

	
	

}
