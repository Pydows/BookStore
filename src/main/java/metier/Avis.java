package metier;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Avis {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private double note;
	private String commentaire;
	@ManyToOne
	private Livre livre;
	@ManyToOne
	private Lecteur lecteur;
	
	public Avis(double note, String commentaire) {
		this.note = note;
		this.commentaire = commentaire;
		livre.setNbNotes((livre.getNbNotes() +1));
		livre.setNote((livre.getNote() + note)/livre.getNbNotes());
	}
	
	
	public Avis(double note, String commentaire, Livre livre, Lecteur lecteur) {
		this.note = note;
		this.commentaire = commentaire;
		this.livre = livre;
		this.lecteur = lecteur;
	}


	public Avis() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getNote() {
		return note;
	}

	public void setNote(double note) {
		this.note = note;
	}

	public String getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

	public Livre getLivre() {
		return livre;
	}

	public void setLivre(Livre livre) {
		this.livre = livre;
	}

	public Lecteur getLecteur() {
		return lecteur;
	}

	public void setLecteur(Lecteur lecteur) {
		this.lecteur = lecteur;
	}
	
	

}
