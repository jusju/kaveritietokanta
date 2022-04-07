package com.example.kaveritietokanta.domain;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
public class Kaveri {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nimi;
	private String katuosoite;
	private String postinumero;
	private String kunta;
	private String osavaltio;
	private String valtio;

	public Kaveri() {
	}

	public Kaveri(String nimi, String katuosoite, String postinumero, String kunta, String osavaltio, String valtio) {
		super();
		this.nimi = nimi;
		this.katuosoite = katuosoite;
		this.postinumero = postinumero;
		this.kunta = kunta;
		this.osavaltio = osavaltio;
		this.valtio = valtio;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNimi() {
		return nimi;
	}

	public void setNimi(String nimi) {
		this.nimi = nimi;
	}

	public String getKatuosoite() {
		return katuosoite;
	}

	public void setKatuosoite(String katuosoite) {
		this.katuosoite = katuosoite;
	}

	public String getPostinumero() {
		return postinumero;
	}

	public void setPostinumero(String postinumero) {
		this.postinumero = postinumero;
	}

	public String getKunta() {
		return kunta;
	}

	public void setKunta(String kunta) {
		this.kunta = kunta;
	}

	public String getOsavaltio() {
		return osavaltio;
	}

	public void setOsavaltio(String osavaltio) {
		this.osavaltio = osavaltio;
	}

	public String getValtio() {
		return valtio;
	}

	public void setValtio(String valtio) {
		this.valtio = valtio;
	}

	@Override
	public String toString() {
		return "Kaveri [id=" + id + ", nimi=" + nimi + ", katuosoite=" + katuosoite + ", postinumero=" + postinumero
				+ ", kunta=" + kunta + ", osavaltio=" + osavaltio + ", valtio=" + valtio + "]";
	}

	
	



}
