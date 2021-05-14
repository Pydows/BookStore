package dao;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import metier.*;
import util.Context;

public class DAOLivre implements IDAO<Livre, Integer>{

	public List<Livre> findAll() {
		EntityManager em = Context.getInstance().getEmf().createEntityManager();
		Query query = em.createQuery("from " + Livre.class);
		List<Livre> g = query.getResultList();
		return g;
	}

	public Livre findById(Integer id) {
		EntityManager em = Context.getInstance().getEmf().createEntityManager();
		Livre l = em.find(Livre.class, id);
		em.close();
		return l;
	}

	public Livre save(Livre l) {
		EntityManager em = Context.getInstance().getEmf().createEntityManager();
		em.getTransaction().begin();
		l = em.merge(l);
		em.getTransaction().commit();
		em.close();
		return l;
	}

	public void delete(Livre l) {
		EntityManager em = Context.getInstance().getEmf().createEntityManager();
		em.getTransaction().begin();
		em.remove(em.merge(l));
		em.getTransaction().commit();
		em.close();		
	}

}
