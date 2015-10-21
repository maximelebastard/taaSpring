package fr.istic.tp5taa.store.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import fr.istic.tp5taa.article.IArticle;
import fr.istic.tp5taa.bank.IBank;
import fr.istic.tp5taa.client.IClient;
import fr.istic.tp5taa.provider.IProvider;
import fr.istic.tp5taa.store.IFastLane;
import fr.istic.tp5taa.store.IJustHaveALook;
import fr.istic.tp5taa.store.ILane;

public class Store implements IFastLane,IJustHaveALook,ILane {

	private HashMap<IClient,List<IArticle>> paniers = new HashMap<IClient, List<IArticle>>();
	private IBank bank;
	private IProvider provider;
	
	public void addItemToCart(IClient client, IArticle article) {
		if(!paniers.containsKey(client)){
			paniers.put(client, new ArrayList<IArticle>());
		}
		paniers.get(client).add(article);
	}

	public void pay(IClient client) {
		
	}

	public Long getPrice(IArticle article) {
		return provider.getPrice(article);
	}

	public boolean isAvailable(IArticle article) {
		return provider.isAvailable(article);
	}

	public void oneShotOrder(IClient client) {
		// TODO Auto-generated method stub
		
	}
	
	public void setProvider(IProvider provider){
		this.provider = provider;
	}

}
