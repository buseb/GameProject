package gameProject.business.concretes;

import gameProject.business.abstracts.PlayerCheckService;
import gameProject.entities.concretes.Player;

public class PlayerCheckManager implements PlayerCheckService {

	@Override
	public boolean CheckIfRealPerson(Player player) {
		return false;
	}

}
