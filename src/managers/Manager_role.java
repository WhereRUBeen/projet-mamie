/**
 * 
 */
package managers;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import entities.Role;

/**
 * @author Been WhereU
 *
 */
public class Manager_role {
	
	
	private static String afficherRole = "";
	private static String afficherRoleParDepartement = "";
	
	public static ArrayList<Role> afficherRole(int id_role) {
		ArrayList<Role> role = null;
		try {
			PreparedStatement pstetment = ConnectionBDD.petPs(id_role);
			ResultSet resultat = pstetment.executeQuery();
			if (resultat.isBeforeFirst()) {
				while(resultat.next()) {
					Role r = new Role();
					r.setId_role(resultat.getInt("id_role"));
					r.setFonction(resultat.getString("fonction"));
					r.setDescription_role(resultat.getString("description_role"));
					r.setFrequence(resultat.getString("frequence"));
					r.setType_action(resultat.getString("type_action"));
					role.add(r);
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return role;
	}

	
	
	public static ArrayList<Role> afficherRoleParDepartement(String departement) {
		ArrayList<Role> role = null;
		try {
			PreparedStatement pstetment = ConnectionBDD.petPs( departement);
			ResultSet resultat = pstetment.executeQuery();
			if (resultat.isBeforeFirst()) {
				while(resultat.next()) {
					Role r = new Role();
					r.setId_role(resultat.getInt("id_role"));
					r.setFonction(resultat.getString("fonction"));
					r.setDescription_role(resultat.getString("description_role"));
					r.setFrequence(resultat.getString("frequence"));
					r.setType_action(resultat.getString("type_action"));
					role.add(r);
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return role;
	}

}
