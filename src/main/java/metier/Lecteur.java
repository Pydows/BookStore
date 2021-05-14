package metier;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="id_compte",referencedColumnName = "id")
public class Lecteur extends Compte{
	public static String saisieString(String msg) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(msg);
		return sc.nextLine();
	}

	public static int saisieInt(String msg) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(msg);
		return sc.nextInt();
	}

	public static double saisieDouble(String msg) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(msg);
		return sc.nextDouble();
	}

	private String nom, prenom;
	@Column(name="date_naissance")
	private LocalDate dateNaissance;
	@ManyToMany
	@JoinTable(name="panier",joinColumns = @JoinColumn(name="idLecteur"),inverseJoinColumns = @JoinColumn(name="idLivre"))
	private List<Livre> panier;
	private double totalAchat;

	public Lecteur(String nom, String prenom, LocalDate dateNaissance, List<Livre> panier, double totalAchat) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.panier = panier;
		this.totalAchat = totalAchat;
	}

	public Lecteur() {
	}

	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public LocalDate getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(LocalDate dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	
	
	public List<Livre> getPanier() {
		return panier;
	}

	public void setPanier(List<Livre> panier) {
		this.panier = panier;
	}

	public double getTotalAchat() {
		return totalAchat;
	}

	public void setTotalAchat(double totalAchat) {
		this.totalAchat = totalAchat;
	}

	public void voter(double note, Livre livre, Avis avis) {
		
		for(Livre l) {
			
			double noteLivre = saisieDouble("Attribuez une note sur dix pour le livre" + livre.getTitre());
			livre.setNote = (noteLivre + noteLivre)/nbNotes;
			Avis avis = saisieString("Exprimez votre avis en quelques lignes");
			return avis;
			
		}

	}
}
