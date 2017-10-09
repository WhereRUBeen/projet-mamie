/**
 * 
 */
package managers;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import entities.Log;
import entities.Magasin;

/**
 * @author Been WhereU
 *
 */
public class Manager_log {
	
	private static String getLogId ="";
	private static String getLogByDate = "";

	public static ArrayList<Log> getMagasinId(int id_magasin) {
		ArrayList<Log> log = null;
		try {
			PreparedStatement pstetment = ConnectionBDD.petPs(getLogId);
			ResultSet resultat = pstetment.executeQuery();
			if (resultat.isBeforeFirst()) {
				while(resultat.next()) {
					Log l = new Log();
					l.setId_log(resultat.getInt("id_log"));
					l.setDate(resultat.getDate("date"));
					l.setType_operation(resultat.getString("type_d'operation"));
					l.setTable_affectee(resultat.getString("table_affectee"));
					l.setUtilisateur_id_user(resultat.getInt("user_id_user"));
					log.add(l);
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return log;
	}
	
	public static ArrayList<Log> getMagasinId(Date date) {
		ArrayList<Log> log = null;
		try {
			PreparedStatement pstetment = ConnectionBDD.petPs(getLogByDate);
			ResultSet resultat = pstetment.executeQuery();
			if (resultat.isBeforeFirst()) {
				while(resultat.next()) {
					Log l = new Log();
					l.setId_log(resultat.getInt("id_log"));
					l.setDate(resultat.getDate("date"));
					l.setType_operation(resultat.getString("type_d'operation"));
					l.setTable_affectee(resultat.getString("table_affectee"));
					l.setUtilisateur_id_user(resultat.getInt("user_id_user"));
					log.add(l);
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return log;
	}

}
