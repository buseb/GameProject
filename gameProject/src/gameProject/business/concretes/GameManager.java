package gameProject.business.concretes;

import gameProject.business.abstracts.GameService;
import gameProject.entities.concretes.Game;



public class GameManager implements GameService{

	public void add(Game game) {
		System.out.println("Sisteme oyun eklendi : " + game.getName());		
	}

	public void update(Game game) {
		System.out.println("Sistemdeki oyun bilgisi güncellendi : " + game.getName());
		
	}

	public void delete(Game game) {
		System.out.println("Sistemden silindi : " + game.getName());		
	}

	public void addMultiple(Game[] games) {
		for (Game game:games) {
			add(game);
		}
		
	}
	
	
}
