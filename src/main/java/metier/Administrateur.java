package metier;

import javax.persistence.DiscriminatorValue;

@DiscriminatorValue("admin")
public class Administrateur extends Compte {

	
	public Administrateur(int id, String login, String password) {
		super(id, login, password);
	}
	
	public Administrateur() {
		super();
	}

	public void ajouterLivre(String livre, String auteur, double prix, String annee)
	{
		
		
	}
	
}