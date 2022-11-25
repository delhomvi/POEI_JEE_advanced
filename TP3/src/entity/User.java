package entity;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "User")
@SessionScoped
public class User {
	private String nom;
	private String prenom;
	private String sexe;

	public User() {
	}
	
	public User(String nom) {
		this.nom = nom;
	}
	
	public Boolean isWhatM() {
		if(sexe.equals("Homme")) {
			return true;
		}else {
			return false;
		}
	}
	public Boolean isWhatF() {
		if(sexe.equals("Femme")) {
			return true;
		}else {
			return false;
		}
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

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "User [nom=" + nom + "]";
	}

}
