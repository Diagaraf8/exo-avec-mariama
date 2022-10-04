package client.shoping;

import dw.movable.Produit;

public class Achat {
	// Nos attribus
	private Produit produitSelectionne ;
	private int nbArticles;
	
	// constructeur de la classe Achat
	public Achat(Produit p, int nbt) {
		produitSelectionne = p;
		nbArticles = nbt;
		
	}
	 
	
	//produitSelectionne = new Produit();
	public float calculerPrixAchat() {
		
		float prixAchat = (int) ( nbArticles * produitSelectionne.getPrixUnitaire());
		
		return prixAchat  ;
		
		}
	

}
