package util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import metier.Compte;

public class Context {
	
	private Compte connected = null;
	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("bookshop");

	private static Context _instance;
	
	private Context() {
		
	}
	
	public static Context getInstance() {
		if (_instance==null)
		{
			_instance=new Context();
		}
		return _instance;
	}
	
	
	public EntityManagerFactory getEmf() {
		return emf;
	}

	public void setEmf(EntityManagerFactory emf) {
		this.emf = emf;
	}

	public Compte getConnected() {
		return connected;
	}

	public void setConnected(Compte connected) {
		this.connected = connected;
	}
	
	
	
	
	
	

}
