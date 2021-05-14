package gameProject.business.concretes;

import gameProject.business.abstracts.CampaignService;
import gameProject.entities.concretes.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void create(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + "kampanyas� eklendi.");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + "kampanyas� g�ncellendi.");		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + "kampanyas� silindi.");
		
	}

}
