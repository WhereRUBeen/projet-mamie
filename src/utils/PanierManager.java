package utils;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


import entities.Produit;
import managers.Manager_produit;

public class PanierManager {

	
	public static void creatPanier(HttpServletRequest request){
		
		HashMap<Integer, Produit> panier = new HashMap<Integer, Produit>();
		
		HttpSession maSession = request.getSession();
		maSession.setAttribute("panier", panier);
		
	};
	
	public static void add(HttpServletRequest request, int idProduit, float qty){

		Produit produit = Manager_produit.afficherProduitParId(idProduit).get(0);
		HttpSession session = request.getSession();
		HashMap<Integer, Produit> panier = (HashMap<Integer, Produit>) session.getAttribute("panier");
		
		if (panier != null){
			if (panier.containsKey(idProduit)){
				panier.remove(idProduit);
				if(qty!=0){
					panier.put(idProduit, produit);
				}
			}else {panier.put(idProduit, produit);}
		} else {
			creatPanier(request);
			panier.put(idProduit, produit);
			}
	};
	
	
	
}
