package gameProject.business.abstracts;

import gameProject.entities.concretes.Player;

public interface PlayerCheckService {
	boolean CheckIfRealPerson(Player player);
}
