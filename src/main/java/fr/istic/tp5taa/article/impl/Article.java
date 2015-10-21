package fr.istic.tp5taa.article.impl;

import fr.istic.tp5taa.article.IArticle;

public class Article implements IArticle{

	private String name;
	private Long price;
	
	public String getName() {
		return name;
	}
	
	public Long getPrice(){
		return price;
	}
	
	public void setName(String pName){
		name= pName;
	}
	
	public void setPrice(Long pPrice){
		price=pPrice;
	}
}
