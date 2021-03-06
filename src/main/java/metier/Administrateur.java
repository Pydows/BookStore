package metier;

import java.time.LocalDate;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

import dao.DAOLivre;

@Entity
@PrimaryKeyJoinColumn(name="id_compte")
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
