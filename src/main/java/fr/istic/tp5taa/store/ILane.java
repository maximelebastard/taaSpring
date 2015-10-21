package fr.istic.tp5taa.store;

import fr.istic.tp5taa.article.IArticle;
import fr.istic.tp5taa.client.IClient;

public interface ILane {
	void addItemToCart(IClient client,IArticle article);
	void pay(IClient client);
}
