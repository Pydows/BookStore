package metier;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Avis {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private int note;
	private String commentaire;
	@ManyToOne
	private Livre livre;
	@ManyToOne
	private Lecteur lecteur;
	
	
	public Avis(int note, String commentaire, Livre livre, Lecteur lecteur) {
		this.note = note;
		this.commentaire = commentaire;
		this.livre = livre;
		this.lecteur = lecteur;
		livre.setNbNotes((livre.getNbNotes() +1));
		livre.setNote((livre.getNote() + note)/livre.getNbNotes());
	}


	public Avis() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNote() {
		return note;
	}

	public void setNote(int note) {
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


	@Override
	public String toString() {
		return "Avis [id=" + id + ", note=" + note + ", commentaire=" + commentaire + ", livre=" + livre + ", lecteur="
				+ lecteur + "]";
	}
	
	

}
