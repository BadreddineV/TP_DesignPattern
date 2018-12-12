package visiteur;


public class VisitNbPhotos implements Visiteur {
	int countPhoto=0;
	int countVideo=0;
	int countArticle=0;
	int countAdaptateur=0;
	public VisitNbPhotos() {
		
	}

	@Override
	public void visit(Album a) {
		System.out.println("Visiting Album");
		
	}

	@Override
	public void visit(Photo p) {
		countPhoto = countPhoto + 1;
		System.out.println("Visiting Photo");
		
	}
	
	public void visit(Video v) {
		countVideo ++;
		System.out.println("Visiting Video");
		
		
	}
	
	@Override
	public void visit(Article a) {
		countArticle ++;
		System.out.println("Visiting Article");
		
		
	}

	@Override
	public void visit(Adaptateur adaptateur) {
		countAdaptateur++;
		System.out.println("Visiting Adapatateur");
		
	}

	@Override
	public void visit(Media m) {
		
	}
	
	public void getNombreDeVideos() {
		System.out.println(countVideo);
	}
	public void getNombreDeArticles() {
		System.out.println(countArticle);
	}
	public void getNombreDeAdaptateur() {
		System.out.println(countAdaptateur);
	}
	
	public void getNombreDePhotos() {
		System.out.println(countPhoto);
	}
	
	public void getterVideo(Video v1) {
		System.out.println(" nom fichier: " +v1.getFichier()+"\n");
		System.out.println(" nom Auteur: " +v1.getAuteur()+"\n");
		
	}
	
	public void getArticle( Article a ) {
		System.out.println(" nom fichier: " +a.getTexte()+"\n");
		System.out.println(" nom Auteur: " +a.getAuteur()+"\n");
	}
	
	public void getAdaptateur(Adaptateur a) {
		System.out.println(" nom Auteur: " +a.getAuteur()+"\n");
		System.out.println(" date: " +a.getDate()+"\n");
		System.out.println(" nom de la photo: " +a.getNom()+"\n");
		System.out.println(" nom fichier : " +a.getFichier()+"\n");
		System.out.print("Texte accompagnant la photo: "+a.getTexte());
	}


	
	

}
