package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import metier.Compte;
import metier.Lecteur;
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
	
	public Compte findByLoginAndPassword(String login, String password) 
	{
		Compte c = null;
		EntityManager em = Context.getInstance().getEmf().createEntityManager();
		try {
			c = (Compte) em.createQuery("select c from Compte c where c.login = :login and c.password = :password").setParameter("login", login).setParameter("password", password).getSingleResult();
		} catch (Exception e) {
			
		}
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
