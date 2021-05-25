package gameProject.business.concretes;

import gameProject.business.abstracts.PlayerCheckService;
import gameProject.entities.concretes.Player;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class PlayerCheckManager implements PlayerCheckService {

	@Override
	public boolean CheckIfRealPerson(Player player) {
		return false;
	}
	public boolean PlayerIfRealPerson(Player player) {
		boolean result=false;
		KPSPublicSoapProxy proxy=new KPSPublicSoapProxy();
		try {
			result=proxy.TCKimlikNoDogrula(Long.parseLong(player.getNationalId()), player.getFirstname().toUpperCase(), player.getLastname().toUpperCase(), player.getDateOfBirth());
		}
		catch(Exception e) {
			System.out.println("Kimlik bilgileri eslesmiyor.");
		}
		
		return result;
		
		
	}
	

}
