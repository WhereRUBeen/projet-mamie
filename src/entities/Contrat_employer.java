/**
 * 
 */
package entities;

import java.io.Serializable;

/**
 * @author Been WhereU
 *
 */
public class Contrat_employer implements Serializable {
	
	private int Idcontrat_client;
	private String url_contrat;
	private int utilisateur_id_user;
	private int numero_de_contrat;
	
	
	
	public Contrat_employer() {
		super();
		// TODO Auto-generated constructor stub
	}



	/**
	 * @return the idcontrat_client
	 */
	public int getIdcontrat_client() {
		return Idcontrat_client;
	}



	/**
	 * @return the url_contrat
	 */
	public String getUrl_contrat() {
		return url_contrat;
	}



	/**
	 * @return the utilisateur_id_user
	 */
	public int getUtilisateur_id_user() {
		return utilisateur_id_user;
	}



	/**
	 * @return the numero_de_contrat
	 */
	public int getNumero_de_contrat() {
		return numero_de_contrat;
	}



	/**
	 * @param idcontrat_client the idcontrat_client to set
	 */
	public void setIdcontrat_client(int idcontrat_client) {
		Idcontrat_client = idcontrat_client;
	}



	/**
	 * @param url_contrat the url_contrat to set
	 */
	public void setUrl_contrat(String url_contrat) {
		this.url_contrat = url_contrat;
	}



	/**
	 * @param utilisateur_id_user the utilisateur_id_user to set
	 */
	public void setUtilisateur_id_user(int utilisateur_id_user) {
		this.utilisateur_id_user = utilisateur_id_user;
	}



	/**
	 * @param numero_de_contrat the numero_de_contrat to set
	 */
	public void setNumero_de_contrat(int numero_de_contrat) {
		this.numero_de_contrat = numero_de_contrat;
	}
	
	

}
