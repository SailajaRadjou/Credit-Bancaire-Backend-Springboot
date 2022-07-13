package com.bancaire.credit.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "client")
public class Client {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "nom")
	private String nom;
	
	@Column(name = "prenom")
	private String prenom;
	
	@Column(name = "date_naissance")
	private Date dateNaissance;
	
	@Column(name = "adresse")
	private String adresse;
	
	@Column(name = "tel")
	private String tel;
	
	@Column(name = "mail")
	private String mail;
	
	@Column(name = "civilite")
	private String civilite;
	
	public Client() {
		super();
	}

	public Client(String nom, String prenom, Date dateNaissance, String adresse, String tel, String mail,
			String civilite) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.adresse = adresse;
		this.tel = tel;
		this.mail = mail;
		this.civilite = civilite;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getCivilite() {
		return civilite;
	}

	public void setCivilite(String civilite) {
		this.civilite = civilite;
	}

	@Override
	public String toString() {
		return "Client [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", dateNaissance=" + dateNaissance
				+ ", adresse=" + adresse + ", tel=" + tel + ", mail=" + mail + ", civilite=" + civilite + "]";
	}

	public boolean equals(Client client) {
		return this.id == client.id && this.nom == client.nom && this.prenom == client.prenom
				&& this.dateNaissance == client.dateNaissance && this.adresse == client.adresse && 
				this.tel == client.tel && this.mail == client.mail && this.civilite == client.civilite;
	}
	
}
