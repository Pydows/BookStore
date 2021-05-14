package dao;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import metier.*;
import util.Context;

public class DAOGenre implements IDAO<Genre, Integer>{

	public List<Genre> findAll() {
		EntityManager em = Context.getInstance().getEmf().createEntityManager();
		Query query = em.createQuery("SELECT g from Genre g" + Genre.class);
		List<Genre> g = query.getResultList();
		em.close();
		return g;
	}

	
	 
	public Genre findById(Integer id) {
		EntityManager em = Context.getInstance().getEmf().createEntityManager();
		Genre g = em.find(Genre.class, id);
		em.close();
		return g;
	}

	public Genre save(Genre g) {
		EntityManager em = Context.getInstance().getEmf().createEntityManager();
		em.getTransaction().begin();
		g = em.merge(g);
		em.getTransaction().commit();
		em.close();
		return g;
	}

	public void delete(Genre g) {
		EntityManager em = Context.getInstance().getEmf().createEntityManager();
		em.getTransaction().begin();
		em.remove(em.merge(g));
		em.getTransaction().commit();
		em.close();		
	}

}
