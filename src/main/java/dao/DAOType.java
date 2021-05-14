package dao;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import metier.*;
import util.Context;

public class DAOType implements IDAO<Type, Integer>{

	public List<Type> findAll() {
		EntityManager em = Context.getInstance().getEmf().createEntityManager();
		Query query = em.createQuery("from " + Type.class);
		List<Type> t = query.getResultList();
		return t;
	}

	public Type findById(Integer id) {
		EntityManager em = Context.getInstance().getEmf().createEntityManager();
		Type t = em.find(Type.class, id);
		em.close();
		return t;
	}

	public Type save(Type t) {
		EntityManager em = Context.getInstance().getEmf().createEntityManager();
		em.getTransaction().begin();
		t = em.merge(t);
		em.getTransaction().commit();
		em.close();
		return t;
	}

	public void delete(Type t) {
		EntityManager em = Context.getInstance().getEmf().createEntityManager();
		em.getTransaction().begin();
		em.remove(em.merge(t));
		em.getTransaction().commit();
		em.close();		
	}

}
