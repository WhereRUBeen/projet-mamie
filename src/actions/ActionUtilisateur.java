package actions;

import java.security.*;
import java.util.ArrayList;

import entities.Utilisateur;
import utils.AuthManager;

public class ActionUtilisateur {

	public static ArrayList<Utilisateur> getAllUtilisateur(){
		
		ArrayList<Utilisateur> userList = new ArrayList<Utilisateur>();
		Utilisateur unUtilisateur1 = new Utilisateur();
		Utilisateur unUtilisateur2 = new Utilisateur();
		Utilisateur unUtilisateur3 = new Utilisateur();
		
		unUtilisateur1.setId(1);
		unUtilisateur1.setIdentifiant("toto");
		unUtilisateur1.setId_role(1);
		unUtilisateur1.setMotdepasse(AuthManager.encrypte("abc123..."));

		unUtilisateur2.setId(2);
		unUtilisateur2.setIdentifiant("titi");
		unUtilisateur2.setId_role(2);
		unUtilisateur2.setMotdepasse(AuthManager.encrypte("abc123..."));
		
		unUtilisateur3.setId(3);
		unUtilisateur3.setIdentifiant("tata");
		unUtilisateur3.setId_role(3);
		unUtilisateur3.setMotdepasse(AuthManager.encrypte("abc123..."));
		
		userList.add(unUtilisateur1);
		userList.add(unUtilisateur2);
		userList.add(unUtilisateur3);
		
		return userList;
	}
	
	public static Utilisateur getUserById(int id){
		ArrayList<Utilisateur> myUsers= new ArrayList<Utilisateur>(); 
		Utilisateur reponse = new Utilisateur();
		
		for(int i = 0; i<myUsers.size();i++){
			if (myUsers.get(i).getId()==id){
				reponse = myUsers.get(i);
			}
		}
		
		return reponse;
	}
	
	public static int getIdByName (String user){
		ArrayList<Utilisateur> myUsers= new ArrayList<Utilisateur>(); 
		int reponse = -1;
		
		for(int i = 0; i<myUsers.size();i++){
			if (myUsers.get(i).getIdentifiant().equals(user)){
				reponse = myUsers.get(i).getId();
			}
		}
		
		return reponse;
	}
	
	
	
	public static int getRoleId(int id){
		int retour=0;
		
		
		return retour;
	}
	
	
}
