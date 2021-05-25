package gameProject.business.abstracts;

import java.rmi.RemoteException;

import gameProject.entities.concretes.Player;

public interface UserValdationService {

	boolean validate(Player player) throws RemoteException;
}
