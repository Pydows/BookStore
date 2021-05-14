package metier;

import java.time.LocalDate;

import javax.persistence.DiscriminatorValue;

import dao.DAOLivre;

@DiscriminatorValue("admin")
public class Administrateur extends Compte {

	
	public Administrateur(String login, String password) {
		super(login, password);
	}
	
	public Administrateur() {
		super();
	}

	public void ajouterLivre(String titre, String auteur, double prix, LocalDate annee)
	{
		DAOLivre daoL = new DAOLivre();
		Livre l = new Livre(titre, auteur, prix, annee);
		daoL.save(l);
	}
	
}
