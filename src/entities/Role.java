/**
 * 
 */
package entities;

import java.io.Serializable;

/**
 * @author Been WhereU
 *
 */
public class Role implements Serializable{
	
	
	private int id_role;
	private String fonction;
	private String departement;
	private String description_role;
	private String type_action;
	private String type_document;
	private String frequence;
	
	
	
	public Role() {
		super();
	}
	
	/**
	 * @return the id_role
	 */
	public int getId_role() {
		return id_role;
	}
	/**
	 * @return the fonction
	 */
	public String getFonction() {
		return fonction;
	}
	/**
	 * @return the departement
	 */
	public String getDepartement() {
		return departement;
	}
	/**
	 * @return the description_role
	 */
	public String getDescription_role() {
		return description_role;
	}
	/**
	 * @return the type_action
	 */
	public String getType_action() {
		return type_action;
	}
	/**
	 * @return the type_document
	 */
	public String getType_document() {
		return type_document;
	}
	/**
	 * @return the frequence
	 */
	public String getFrequence() {
		return frequence;
	}
	/**
	 * @param id_role the id_role to set
	 */
	public void setId_role(int id_role) {
		this.id_role = id_role;
	}
	/**
	 * @param fonction the fonction to set
	 */
	public void setFonction(String fonction) {
		this.fonction = fonction;
	}
	/**
	 * @param departement the departement to set
	 */
	public void setDepartement(String departement) {
		this.departement = departement;
	}
	/**
	 * @param description_role the description_role to set
	 */
	public void setDescription_role(String description_role) {
		this.description_role = description_role;
	}
	/**
	 * @param type_action the type_action to set
	 */
	public void setType_action(String type_action) {
		this.type_action = type_action;
	}
	/**
	 * @param type_document the type_document to set
	 */
	public void setType_document(String type_document) {
		this.type_document = type_document;
	}
	/**
	 * @param frequence the frequence to set
	 */
	public void setFrequence(String frequence) {
		this.frequence = frequence;
	}
	
	
	
	

}
