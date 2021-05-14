package dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import metier.Lecteur;
import util.Context;

public class DAOLecteur implements IDAO<Lecteur,Integer>{

    public Lecteur findById(Integer id) {
        EntityManager em = Context.getInstance().getEmf().createEntityManager();

        Lecteur lecteur = em.find(Lecteur.class, id);

        em.close();
        return lecteur;
    }

    public List<Lecteur> findAll() {
        EntityManager em = Context.getInstance().getEmf().createEntityManager();

        Query myQuery = em.createQuery("SELECT c from Lecteur c" + Lecteur.class);
        List<Lecteur> lecteurs=myQuery.getResultList();
        em.close();
        return lecteurs;
    }


    public Lecteur save(Lecteur Lecteur) {
        EntityManager em = Context.getInstance().getEmf().createEntityManager();

        em.getTransaction().begin();
        Lecteur = em.merge(Lecteur);
        em.getTransaction().commit();

        em.close();
        return Lecteur;
    }

    public void delete(Lecteur Lecteur) {
        EntityManager em = Context.getInstance().getEmf().createEntityManager();

        em.getTransaction().begin();
        Lecteur = em.merge(Lecteur);
        em.remove(Lecteur);
        em.getTransaction().commit();

        em.close();

    }

}