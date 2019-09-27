package fi.utu.tech;

public class NoResultsException extends Exception {

	/**
	 * ottaa kiinni miinusmerkkisen diskriminantin aiheuttaman virheen
	 */
	private static final long serialVersionUID = 1L;
	
	public NoResultsException(String viesti) {
		super(viesti);
	}
}
