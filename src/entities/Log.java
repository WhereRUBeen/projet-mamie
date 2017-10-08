/**
 * 
 */
package entities;

import java.io.Serializable;
import java.sql.Date;

/**
 * @author Been WhereU
 *
 */
public class Log implements Serializable{
	
	private int Id_log;
	private Date date;
	private String type_operation;
	private String table_affectee;
	private int utilisateur_id_user;
	
	
	
	public Log() {
		super();
		// TODO Auto-generated constructor stub
	}



	/**
	 * @return the id_log
	 */
	public int getId_log() {
		return Id_log;
	}



	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}



	/**
	 * @return the type_operation
	 */
	public String getType_operation() {
		return type_operation;
	}



	/**
	 * @return the table_affectee
	 */
	public String getTable_affectee() {
		return table_affectee;
	}



	/**
	 * @return the utilisateur_id_user
	 */
	public int getUtilisateur_id_user() {
		return utilisateur_id_user;
	}



	/**
	 * @param id_log the id_log to set
	 */
	public void setId_log(int id_log) {
		Id_log = id_log;
	}



	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}



	/**
	 * @param type_operation the type_operation to set
	 */
	public void setType_operation(String type_operation) {
		this.type_operation = type_operation;
	}



	/**
	 * @param table_affectee the table_affectee to set
	 */
	public void setTable_affectee(String table_affectee) {
		this.table_affectee = table_affectee;
	}



	/**
	 * @param utilisateur_id_user the utilisateur_id_user to set
	 */
	public void setUtilisateur_id_user(int utilisateur_id_user) {
		this.utilisateur_id_user = utilisateur_id_user;
	}
	
	
	
	
	

}
