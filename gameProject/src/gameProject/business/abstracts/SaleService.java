package gameProject.business.abstracts;

import gameProject.entities.concretes.Campaign;
import gameProject.entities.concretes.Game;
import gameProject.entities.concretes.Player;

public interface SaleService {
	void sale(Game game,Player player);
	void saleWithCampaign(Game game,Player player,Campaign campaign);
}
