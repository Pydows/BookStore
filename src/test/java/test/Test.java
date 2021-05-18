package test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dao.DAOAdministrateur;
import jframe.GUIBienvenue;
import metier.Administrateur;


public class Test {

	public static void main(String[] args) {
		Administrateur a = new Administrateur("adm", "adm");
		DAOAdministrateur Daoadmintest = new DAOAdministrateur();
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("bookshop");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		Daoadmintest.save(a);
		em.getTransaction().commit();

		em.close();

		GUIBienvenue.main(args);
		emf.close();

		
	}

}
