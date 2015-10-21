package fr.istic.tp5taa.store;

import fr.istic.tp5taa.article.IArticle;

public interface IJustHaveALook extends IStore {
	
	Long getPrice(IArticle article);
	boolean isAvailable(IArticle article);
}
