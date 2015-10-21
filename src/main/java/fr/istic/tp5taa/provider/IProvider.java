package fr.istic.tp5taa.provider;

import fr.istic.tp5taa.article.IArticle;

public interface IProvider {

	Long getPrice(IArticle article);
	boolean isAvailable(IArticle article);
}
