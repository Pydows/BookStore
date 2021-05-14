package metier;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.transaction.Status;

@Entity
public class Livre {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String titre;
	private String auteur;
	private double prix;
	private double note;
	private int nbNotes =0;
	private LocalDate annee;
	@Enumerated(EnumType.STRING)
    private Genre genre;
	private Type type;
	
	
	@OneToMany(mappedBy = "livre")
	private List<Avis> avis;
	
	public Livre(int id, String titre, String auteur, double prix, LocalDate annee) {
		this.id = id;
		this.titre = titre;
		this.auteur = auteur;
		this.prix = prix;
		this.annee = annee;
	}
	
	public Livre(String titre, String auteur, double prix, LocalDate annee) {
		this.titre = titre;
		this.auteur = auteur;
		this.prix = prix;
		this.annee = annee;
	}

	public Livre() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public double getNote() {
		return note;
	}

	public void setNote(double note) {
		this.note = note;
	}

	public int getNbNotes() {
		return nbNotes;
	}

	public void setNbNotes(int nbNotes) {
		this.nbNotes = nbNotes;
	}

	public LocalDate getAnnee() {
		return annee;
	}

	public void setAnnee(LocalDate annee) {
		this.annee = annee;
	}

	public List<Avis> getAvis() {
		return avis;
	}

	public void setAvis(List<Avis> avis) {
		this.avis = avis;
	}
	
	public void addAvis(Avis avis) {
		this.avis.add(avis);
	}

}
