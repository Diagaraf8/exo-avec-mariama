package dw.movable;

public class Produit {
	
	// nos attribus
	private String codeP;
	private float prixUnitaire;

	// Notre constructeur
	public Produit(String codeP, float prixUnitaire) {
		this.codeP = codeP;
		this.prixUnitaire = prixUnitaire ;
	}
	
	public String getCodeP() {
		return codeP;
	}


	public void setCodeP(String codeP) {
		this.codeP = codeP;
	}


	public float getPrixUnitaire() {
		
		return prixUnitaire;
	}


	public void setPrixUnitaire(float prixUnitaire) {
		this.prixUnitaire = prixUnitaire;
	}

	
}
