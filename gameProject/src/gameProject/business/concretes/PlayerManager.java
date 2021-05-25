package gameProject.business.concretes;

import java.util.List;
import java.rmi.RemoteException;

import gameProject.business.abstracts.PlayerCheckService;
import gameProject.business.abstracts.PlayerService;
import gameProject.business.abstracts.UserValdationService;
import gameProject.entities.concretes.Player;

public class PlayerManager implements PlayerService {
	private PlayerCheckService playerCheckService;
	private UserValdationService userValidationService;

	
	public PlayerManager(PlayerCheckService playerCheckService) {
		UserValdationService userValidationService = this.userValidationService = userValidationService;
	}


	@Override
	public void add(Player player) throws RemoteException {
		if (this.userValidationService.validate(player)) {
			System.out.println(player.getPlayerName() + " veritabanýna eklendi");
		} else {
			System.out.println(player.getPlayerName() + " veritabanýna eklenemedi, " + "bilgilerini kontrol edin");
		}

		
	}


	@Override
	public void update(Player player) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void delete(Player player) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void register(Player player) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	

	
}
