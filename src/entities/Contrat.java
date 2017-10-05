/**
 * 
 */
package entities;

import java.io.Serializable;

/**
 * @author Been WhereU
 *
 */
public class Contrat implements Serializable{
	
	
	/*** attributs*/
	private int IdContrat_client;
	private int utilisateur_id_user;
	private int numero_de_contrat;
	private String url_contrat;
	
	
	
	/*** construtor*/
	public Contrat() {
		super();
	}


	/*** method*/
	
	/*** @return the idContrat_client*/
	public int getIdContrat_client() {
		return IdContrat_client;
	}



	/*** @return the utilisateur_id_user*/
	public int getUtilisateur_id_user() {
		return utilisateur_id_user;
	}

	/*** @return the numero_de_contrat*/
	public int getNumero_de_contrat() {
		return numero_de_contrat;
	}

	/*** @return the url_contrat*/
	public String getUrl_contrat() {
		return url_contrat;
	}

	/*** @param idContrat_client the idContrat_client to set*/
	public void setIdContrat_client(int idContrat_client) {
		IdContrat_client = idContrat_client;
	}


	/*** @param utilisateur_id_user the utilisateur_id_user to set*/
	public void setUtilisateur_id_user(int utilisateur_id_user) {
		this.utilisateur_id_user = utilisateur_id_user;
	}


	/*** @param numero_de_contrat the numero_de_contrat to set*/
	public void setNumero_de_contrat(int numero_de_contrat) {
		this.numero_de_contrat = numero_de_contrat;
	}


	/*** @param url_contrat the url_contrat to set*/
	public void setUrl_contrat(String url_contrat) {
		this.url_contrat = url_contrat;
	}

}
