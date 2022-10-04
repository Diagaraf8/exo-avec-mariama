package client.shoping;

public class Panier {
// attributs
	private int nbAchat;
	private Achat[] lesAchats;
	
	// Constructeur 
	public Panier(int n) {
		// nouvelle affectation de notre objet "lesAchats"
		lesAchats = new Achat[n];
	}
	
	public int ajouter() {
		int x;
		
		Panier p = new Panier(0);
		
		x  = p.nbAchat;
		
		
		if(lesAchats.equals(null)) {
			return x = 0;
		}
		else return x = x + 1;
		
		}

}
