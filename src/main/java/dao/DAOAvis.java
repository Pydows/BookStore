package dao;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import metier.*;
import util.Context;

public class DAOAvis implements IDAO<Avis, Integer>{

	public List<Avis> findAll() {
		EntityManager em = Context.getInstance().getEmf().createEntityManager();
		Query query = em.createQuery("from " + Avis.class);
		List<Avis> a = query.getResultList();
		return a;
	}

	public Avis findById(Integer id) {
		EntityManager em = Context.getInstance().getEmf().createEntityManager();
		Avis a = em.find(Avis.class, id);
		em.close();
		return a;
	}

	public Avis save(Avis a) {
		EntityManager em = Context.getInstance().getEmf().createEntityManager();
		em.getTransaction().begin();
		a = em.merge(a);
		em.getTransaction().commit();
		em.close();
		return a;
	}

	public void delete(Avis a) {
		EntityManager em = Context.getInstance().getEmf().createEntityManager();
		em.getTransaction().begin();
		em.remove(em.merge(a));
		em.getTransaction().commit();
		em.close();		
	}

}
