package com.bancaire.credit.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "compte")
public class Compte {

	@Id	
	@Column(name = "num")
	private String num;
	
	@Column(name = "date_creation")
	private Date dateCreation;
	
	@Column(name = "solde")
	private double solde;
	
	@Column(name = "type")
	private String type;
	
	@Column(name = "decouvert")
	private double decouvert;
	
	@Column(name = "taux")
	private double taux;
	
	
	public Compte() {
		super();
	}


	public Compte(String num, Date dateCreation, double solde, String type, double decouvert, double taux) {
		super();
		this.num = num;
		this.dateCreation = dateCreation;
		this.solde = solde;
		this.type = type;
		this.decouvert = decouvert;
		this.taux = taux;
	}


	public String getNum() {
		return num;
	}


	public void setNum(String num) {
		this.num = num;
	}


	public Date getDateCreation() {
		return dateCreation;
	}


	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}


	public double getSolde() {
		return solde;
	}


	public void setSolde(double solde) {
		this.solde = solde;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public double getDecouvert() {
		return decouvert;
	}


	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}


	public double getTaux() {
		return taux;
	}


	public void setTaux(double taux) {
		this.taux = taux;
	}


	@Override
	public String toString() {
		return "Compte [num=" + num + ", dateCreation=" + dateCreation + ", solde=" + solde + ", type=" + type
				+ ", decouvert=" + decouvert + ", taux=" + taux + "]";
	}
	
	
}
