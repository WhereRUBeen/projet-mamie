package actions;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import entities.Role;
import managers.Manager_role;


public class Action_role {
	
	
	public static void afficherRole(HttpServletRequest request , int id_role) {
		ArrayList<Role> roleId = Manager_role.getById(id_role);
		request.setAttribute("roleId", roleId);
	}
	
	public static void afficherRoleParDepartement(HttpServletRequest request, String departement) {
		ArrayList<Role> roleDepartement = Manager_role.getByDepartement(departement);
		request.setAttribute("roleDepartement", roleDepartement);
	}
	

}
