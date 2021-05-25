package gameProject.adapters;

import java.rmi.RemoteException;

import gameProject.business.abstracts.PlayerCheckService;
import gameProject.entities.concretes.Player;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements PlayerCheckService {

	@Override
	public boolean CheckIfRealPerson(Player player) {

		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		boolean result = false;
		try {

			result = client.TCKimlikNoDogrula(Long.parseLong(player.getNationalId()),
					player.getFirstname().toUpperCase(), player.getLastname().toUpperCase(),
					player.getDateOfBirth());

		} catch (RemoteException e) {
			e.printStackTrace();
		}

		return result;

	}

}
