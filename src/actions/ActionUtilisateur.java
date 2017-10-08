package actions;

import java.security.*;
import java.util.ArrayList;

import entities.Utilisateur;

public class ActionUtilisateur {

	public static ArrayList<Utilisateur> getAllUtilisateur(){
		
		return null;
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
	
	
}
