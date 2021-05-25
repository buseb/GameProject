package gameProject;

import java.time.LocalDate;

import gameProject.adapters.MernisServiceAdapter;
import gameProject.business.concretes.CampaignManager;
import gameProject.business.concretes.GameManager;
import gameProject.business.concretes.PlayerManager;
import gameProject.entities.concretes.Campaign;
import gameProject.entities.concretes.Game;
import gameProject.entities.concretes.Player;

public class Main {

	public static void main(String[] args) {
		PlayerManager playerManager=new PlayerManager(new MernisServiceAdapter());
		
		
	
}
