package entity;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "IMC")
@SessionScoped

public class IMC {
	private String nom;
	private String prenom;
	private String sexe;
	private int age;
	private int taille;
	private int poids;
	private String conseils;

	// Constructeurs
	public IMC() {
	}

	public IMC(String nom, String prenom, String sexe, int age, int taille, int poids) {
		this.nom = nom;
		this.prenom = prenom;
		this.sexe = sexe;
		this.age = age;
		this.taille = taille;
		this.poids = poids;
	}

	// Getters et setters
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

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getTaille() {
		return taille;
	}

	public void setTaille(int taille) {
		this.taille = taille;
	}

	public int getPoids() {
		return poids;
	}

	public void setPoids(int poids) {
		this.poids = poids;
	}

	public String getConseils() {
		return conseils;
	}

	public void setConseils(String conseils) {
		this.conseils = conseils;
	}

	// Autres fonctions
	public String conseils() {
		Double IMCvalue = (double) this.poids / (this.taille * this.taille/100/100);
		if (IMCvalue <= 18.5) {
			return "Conseil 1";
		}
		if (IMCvalue >= 25) {
			return "Conseil 2";
		} else {
			return "conseil 3";
		}
	}
}
