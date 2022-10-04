package test;

import client.shoping.Panier;
import dw.movable.Produit;
import client.shoping.Achat;

public class Principale {

	public static void main(String[] args) {
		Panier lePanier = new Panier(4);
		
		Produit unProduit = new Produit("USB3007", 15);
		
		Achat unAchat = new Achat(unProduit, 3);

	}

}
