package visiteur;

public interface Visiteur {
	 void visit(Album a);
	 void visit(Photo p);
	 void visit(Video v);
	 void visit (Article a);
	 public void getNombreDePhotos(Album a);
	 public void getterVideo(Video a);
	 public void getterArticle(Article a);

	
}
