package shared.networking;

import shared.wrappers.Band;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

public interface SearchBandServer extends Remote
{
	/**
	 * Method which extracts bands from the database with matching information from the
	 * band parameter
	 * @param band this parameter contains the search criteria the search method will match
	 * @return ArrayList of Band objects which concur to the search condition. These objects contain
	 * the name of the band, the city the band usually plays in and bandId of the band
	 * @throws RemoteException - RMI Exception
	 */
	ArrayList<Band> search(Band band) throws RemoteException;
}
