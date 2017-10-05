package utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import actions.ActionUtilisateur;
import entities.Utilisateur;

public class AuthManager {
	
	
	
	public static String encrypte(String toEncrypt){
		String encryptPsw = "";
		try {
			MessageDigest digestPassword=MessageDigest.getInstance("MD5");
			digestPassword.update(toEncrypt.getBytes());
			byte[] tableauDeBytes=digestPassword.digest();
			StringBuffer passwordCrypteMD5 = new StringBuffer();
			for (byte unByte : tableauDeBytes) {


			
				encryptPsw = passwordCrypteMD5.append(String.format("%02x", unByte & 0xff)).toString();
			} }catch (NoSuchAlgorithmException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				}
			
		return encryptPsw;
	}
		
		
	public static void setUserSession(int id, HttpServletRequest request){
		Utilisateur user = ActionUtilisateur.getUserById(id);
		HttpSession session = request.getSession();
		
		session.setAttribute("Utilisateur", user);
	};
		
	public static boolean userExist(String user){
		ArrayList<Utilisateur> myUsers = ActionUtilisateur.getAllUtilisateur();
		boolean retour = false;
		for (int i=0; i<myUsers.size();i++){
			
			if (myUsers.get(i).getIdentifiant() == user){retour = true; break;}
			
		}		
		
		return retour;
	}
		
	public static boolean pwsIsGood(String psw, int id){
		boolean retour = false;
		
		if(encrypte(psw).equals(ActionUtilisateur.getUserById(id).getMotdepasse())){retour = true;}
		
		return retour;
	}
	
	
	
	
	
}
