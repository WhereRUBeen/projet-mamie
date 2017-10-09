/**
 * 
 */
package actions;

import java.sql.Date;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import entities.Log;


/**
 * @author Been WhereU
 *
 */
public class Action_log {
	
	
	public static void showLogById(HttpServletRequest request, int id_log) {
		ArrayList<Log> magasinsId = Manager_utilisateur.getMagasinId(id_log);
		request.setAttribute("magasinsId", magasinsId);
	}
	
	public static void showLogByDate(HttpServletRequest request, Date date ){
		ArrayList<Log> magasinsName = Manager_utilisateur.getMagasinName(date);
		request.setAttribute("magasinsName", magasinsName);
	} 


}
