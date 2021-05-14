package gameProject.business.concretes;

import gameProject.business.abstracts.PlayerCheckService;
import gameProject.business.abstracts.PlayerService;
import gameProject.entities.concretes.Player;

public class PlayerManager implements PlayerService {
	private PlayerCheckService playerCheckService;

	public PlayerManager(PlayerCheckService playerCheckService) {
		super();
		this.playerCheckService = playerCheckService;
	}

	@Override
	public void add(Player player) {
		if (this.playerCheckService.CheckIfRealPerson(player)) {
			System.out.println("Veritabanýna kaydedildi :" + player.getFirstname() + ""+player.getLastname());
			
		}
		else {
			System.out.println("Kullanýcý bilgileri hatalý");
		}
		
	}

	@Override
	public void update(Player player) {
		System.out.println("Veritabaný kaydý güncellendi:"+player.getFirstname()+""+player.getLastname());
		
	}

	@Override
	public void delete(Player player) {
		System.out.println("Veritabaný kaydý silindi:"+ player.getFirstname()+""+player.getLastname());
	}
	
	
}
