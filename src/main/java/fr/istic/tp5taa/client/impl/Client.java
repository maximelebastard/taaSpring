package fr.istic.tp5taa.client.impl;

import fr.istic.tp5taa.article.IArticle;
import fr.istic.tp5taa.bank.account.IAccount;
import fr.istic.tp5taa.client.IClient;
import fr.istic.tp5taa.store.IFastLane;
import fr.istic.tp5taa.store.IJustHaveALook;
import fr.istic.tp5taa.store.ILane;

public class Client implements IClient {

	private Long id;
	private IFastLane fastLane;
	private ILane lane;
	private IJustHaveALook justHaveALook;
	private IAccount account;
	private IArticle articleWanted;
	
	public void run() {
		System.out.println("Client "+id+" commence ses courses.");
		if(justHaveALook.isAvailable(articleWanted)){
			System.out.println("L'article "+articleWanted.getName() +" est disponible");
			Long articlePrice = justHaveALook.getPrice(articleWanted);
			if(articlePrice>account.getMoney()){
				System.out.println("L'article "+articleWanted.getName() +" est trop cher pour le client "+id);
				System.out.println("Client "+id+" a fini ses courses.");
				return;
			}else{
				lane.addItemToCart(this, articleWanted);
				System.out.println("L'article "+articleWanted.getName() +" a été ajouté dans le panier du client "+id);
				lane.pay(this);
				System.out.println("Le client "+id+" a payé ");
			}
		}
	}
	
	public void setLane(ILane pLane){
		lane=pLane;
	}
	
	public void setJustHaveALook(IJustHaveALook pJustHaveLook){
		justHaveALook=pJustHaveLook;
	}
	
	public void setAccount(IAccount pAccount){
		account=pAccount;
	}
	
	public void setArticleWanted(IArticle pArticle){
		articleWanted = pArticle;
	}
	
	public void setId(Long pId){
		id=pId;
	}

}
