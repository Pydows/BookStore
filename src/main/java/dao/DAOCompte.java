package dao;

import java.util.List;

import javax.persistence.EntityManager;

import metier.Compte;
import util.Context;

public class DAOCompte implements IDAO<Compte, Integer> {

	public List<Compte> findAll() {
		return null;
	}

	public Compte findById(Integer id)
	{
		EntityManager em = Context.getInstance().getEmf().createEntityManager();
		Compte c = em.find(Compte.class, id);
		em.close();
		return c;
	}

	public Compte save(Compte c) {
		EntityManager em = Context.getInstance().getEmf().createEntityManager();
		em.getTransaction().begin();
		c = em.merge(c);
		em.getTransaction().commit();
		em.close();
		return c;
	}

	public void delete(Compte c) {
		EntityManager em = Context.getInstance().getEmf().createEntityManager();
		em.getTransaction().begin();
		em.remove(em.merge(c));
		em.getTransaction().commit();
		em.close();
	}


}
