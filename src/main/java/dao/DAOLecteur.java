package dao;

import java.util.List;

import javax.management.Query;
import javax.naming.Context;
import javax.persistence.EntityManager;

import metier.Lecteur;

public class DAOLecteur implements IDAO<Lecteur,Integer>{

	public Lecteur findById(int id) {
		EntityManager em = Context.get_instance().getEmf().createEntityManager();
		
		Lecteur lecteur = em.find(Lecteur.class, id);
		
		em.close();
		return lecteur;
	}

	public List<Lecteur> findAll() {
		EntityManager em = Context.get_instance().getEmf().createEntityManager();
		
		Query myQuery = em.createQuery("SELECT c from Lecteur c",Lecteur.class);
		List<Lecteur> lecteurs=myQuery.getResultList();
		em.close();
		return lecteurs;
	}


	public Lecteur save(Lecteur Lecteur) {
		EntityManager em = Context.get_instance().getEmf().createEntityManager();
		
		em.getTransaction().begin();
		Lecteur = em.merge(Lecteur);
		em.getTransaction().commit();
		
		em.close();
		return Lecteur;
	}

	public void delete(Lecteur Lecteur) {
		EntityManager em = Context.get_instance().getEmf().createEntityManager();
		
		em.getTransaction().begin();
		Lecteur = em.merge(Lecteur);
		em.remove(Lecteur);
		em.getTransaction().commit();
		
		em.close();
	}
