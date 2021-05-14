package gameProject.business.abstracts;

import gameProject.entities.concretes.Campaign;

public interface CampaignService {
	void create(Campaign campaign);
	void update(Campaign campaign);
	void delete(Campaign campaign);
}
