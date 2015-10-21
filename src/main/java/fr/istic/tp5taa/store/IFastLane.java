package fr.istic.tp5taa.store;

import fr.istic.tp5taa.client.IClient;

public interface IFastLane extends IStore{
	void oneShotOrder(IClient client);
}
