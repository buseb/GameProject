package gameProject.business.abstracts;

import java.rmi.RemoteException;

import gameProject.entities.concretes.Player;

public interface PlayerService {
	void add(Player player) throws RemoteException;
	void update(Player player);
	void delete(Player player);
	void register(Player player);
}
