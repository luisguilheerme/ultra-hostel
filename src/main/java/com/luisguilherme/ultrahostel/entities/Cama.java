package com.luisguilherme.ultrahostel.entities;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_cama")
public class Cama {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private boolean disponibilty;
	
	@ManyToOne
	@JoinColumn(name="id_quarto")
	private Quarto quarto;
	
	public Cama() {
		
	}

	public Cama(Integer id, String name, boolean disponibilty, Quarto quarto) {
		this.id = id;
		this.name = name;
		this.disponibilty = disponibilty;
		this.quarto = quarto;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isDisponibilty() {
		return disponibilty;
	}

	public void setDisponibilty(boolean disponibilty) {
		this.disponibilty = disponibilty;
	}

	public Quarto getQuarto() {
		return quarto;
	}

	public void setQuarto(Quarto quarto) {
		this.quarto = quarto;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cama other = (Cama) obj;
		return Objects.equals(id, other.id);
	}	
		

}
