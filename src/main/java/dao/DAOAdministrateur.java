package dao;

import java.util.List;

import javax.persistence.EntityManager;

import metier.Administrateur;
import util.Context;

public class DAOAdministrateur implements IDAO<Administrateur, Integer> {

	public List<Administrateur> findAll() {
		return null;
	}

	public Administrateur findById(Integer id)
	{
		EntityManager em = Context.getInstance().getEmf().createEntityManager();
		Administrateur a = em.find(Administrateur.class, id);
		em.close();
		return a;
	}

	public Administrateur save(Administrateur a) {
		EntityManager em = Context.getInstance().getEmf().createEntityManager();
		em.getTransaction().begin();
		a = em.merge(a);
		em.getTransaction().commit();
		em.close();
		return a;
	}

	public void delete(Administrateur a) {
		EntityManager em = Context.getInstance().getEmf().createEntityManager();
		em.getTransaction().begin();
		em.remove(em.merge(a));
		em.getTransaction().commit();
		em.close();
	}


}
