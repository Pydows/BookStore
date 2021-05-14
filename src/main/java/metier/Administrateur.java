package metier;

import javax.persistence.Entity;

@Entity
public class Administrateur extends Compte {

	
	public Administrateur(int id, String login, String password) {
		super(id, login, password);
	}

	public void ajouterLivre(String livre, String auteur, double prix, String annee)
	{
		
		
	}
	
}
