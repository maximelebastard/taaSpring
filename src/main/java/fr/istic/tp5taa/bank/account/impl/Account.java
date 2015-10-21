package fr.istic.tp5taa.bank.account.impl;

import fr.istic.tp5taa.bank.account.IAccount;

public class Account implements IAccount{

	private Long money;
	
	public Long getMoney() {
		return money;
	}
	
	public void setMoney(Long pMoney){
		money=pMoney;
	}
}
