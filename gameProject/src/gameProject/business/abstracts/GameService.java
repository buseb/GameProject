package gameProject.business.abstracts;

import gameProject.entities.concretes.Game;

public interface GameService {
	void add(Game game);
	void update(Game game);
	void delete(Game game);
	void addMultiple(Game[] games);
}
