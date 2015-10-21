package fr.istic.tp5taa.provider.impl;

import java.util.HashMap;
import java.util.List;

import fr.istic.tp5taa.article.IArticle;
import fr.istic.tp5taa.provider.IProvider;

public class Provider implements IProvider {

	private HashMap<IArticle,Integer> articlesQuantites;
	
	public Long getPrice(IArticle article) {
		for(IArticle a : articlesQuantites.keySet()){
			if(a==article){
				return article.getPrice();
			}
		}
		return 0L;
	}

	public boolean isAvailable(IArticle article) {
		if(articlesQuantites.containsKey(article)){
			if(articlesQuantites.get(article) > 0){
				return true;
			}
		}
		return false;
	}
	
	public void setArticlesQuantites(HashMap<IArticle,Integer> pArticlesQuantites){
		articlesQuantites=pArticlesQuantites;
	}

}
