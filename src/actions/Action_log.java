/**
 * 
 */
package actions;
import java.sql.Date;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import entities.Log;
import managers.Manager_log;

/**
 * @author Been WhereU
 *
 */
public class Action_log {
	
	
	public static void showLogById(HttpServletRequest request, int id_log) {
		ArrayList<Log> LogId = Manager_log.getLogId(id_log);
		request.setAttribute("LogId", LogId);
	}
	
	public static void showLogByDate(HttpServletRequest request, Date date ){
		ArrayList<Log> LogDate = Manager_log.getLogByDate(date);
		request.setAttribute("LogDate", LogDate);
	} 


}
