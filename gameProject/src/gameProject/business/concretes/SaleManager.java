package gameProject.business.concretes;

import java.time.LocalDate;

import gameProject.business.abstracts.CampaignService;
import gameProject.business.abstracts.SaleService;
import gameProject.entities.concretes.Campaign;
import gameProject.entities.concretes.Game;
import gameProject.entities.concretes.Player;

public class SaleManager implements SaleService {
	
	private CampaignService campaignService;
	
	public SaleManager(){
		
	}

	@Override
	public void sale(Game game, Player player) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saleWithCampaign(Game game, Player player, Campaign campaign) {
		double reducedPrice = game.getUnitPrice() * ((100-campaign.getDiscountRate())/100);
		
		LocalDate start = campaign.getStartDate();
		LocalDate end = campaign.getExpirationDate();
		LocalDate today = LocalDate.now();
		
		if (start.getDayOfMonth()<= today.getDayOfMonth() && today.getDayOfMonth() <=end.getDayOfMonth()) {
			System.out.println(game.getName()+"isimli oyun"+ campaign.getCampaignName() +"kampanyasý ile"+
		"%"+ campaign.getDiscountRate() + "indirimli olarak" + reducedPrice+ "TL'ye satýn alýndý.");
		}		
	}


}
