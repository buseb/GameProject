package gameProject.business.concretes;

import gameProject.business.abstracts.CampaignService;
import gameProject.entities.concretes.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void create(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + "kampanyasý eklendi.");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + "kampanyasý güncellendi.");		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + "kampanyasý silindi.");
		
	}

}
