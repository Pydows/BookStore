package metier;

public class Auteur {
	private String nom;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "Auteur [nom=" + nom + "]";
	}
	
	

}
