/**
 * 
 */
package entities;

import java.io.Serializable;

/**
 * @author Been WhereU
 *
 */
@SuppressWarnings("serial")
public class Utilisateur implements Serializable {
	// Atributs
	private int id;
	private String nom;
	private String prenom;
	private String adresse;
	private String telephone;
	private String email;
	private String identifiant;
	private String motdepasse;
	private int id_role;
	private int id_magasin;

	// constructor
	public Utilisateur() {
		super();
	}

	// ***getters**//

	/*** @return the id */
	public int getId() {
		return id;
	}

	/*** @return the nom*/
	public String getNom() {
		return nom;
	}

	/*** @return the prenom*/
	public String getPrenom() {
		return prenom;
	}

	/*** @return the adresse*/
	public String getAdresse() {
		return adresse;
	}

	/*** @return the telephone*/
	public String getTelephone() {
		return telephone;
	}

	/*** @return the email*/
	public String getEmail() {
		return email;
	}

	/*** @return the identifiant*/
	public String getIdentifiant() {
		return identifiant;
	}

	/*** @return the motdepasse*/
	public String getMotdepasse() {
		return motdepasse;
	}

	/*** @return the id_role*/
	public int getId_role() {
		return id_role;
	}

	/*** @return the id_magasin*/
	public int getId_magasin() {
		return id_magasin;
	}
	
	//***setters***//

	/*** @param id*  the id to set*/
	public void setId(int id) {
		this.id = id;
	}

	/*** @param nom*  the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/*** @param prenom* the prenom to set*/
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/*** @param adresse* the adresse to set*/
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	/*** @param telephone* the telephone to set*/
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	/*** @param email*      the email to set*/
	public void setEmail(String email) {
		this.email = email;
	}

	/*** @param identifiant* the identifiant to set*/
	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;
	}

	/*** @param motdepasse*  the motdepasse to set*/
	public void setMotdepasse(String motdepasse) {
		this.motdepasse = motdepasse;
	}

	/*** @param id_role*    the id_role to set*/
	public void setId_role(int id_role) {
		this.id_role = id_role;
	}

	/*** @param id_magasin* the id_magasin to set*/
	public void setId_magasin(int id_magasin) {
		this.id_magasin = id_magasin;
	}

}
