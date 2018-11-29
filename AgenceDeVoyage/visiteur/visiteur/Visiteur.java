package visiteur;

public interface Visiteur {
	 void visit(Adaptateur adaptateur);
	 void visit(Photo p);
	 void visit(Video v);
	 void visit (Article a);
	 public void getNombreDePhotos(Album a);
	 public void getterVideo(Video a);
	 public void getterArticle(Article a);
	 public void getTexte(Article a);
	void visit(Album album);

	
}
