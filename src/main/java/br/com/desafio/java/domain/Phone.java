package br.com.desafio.java.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

@Entity(name = "phones")
public class Phone {

	@Id
	@GeneratedValue
	@Column(updatable = false, insertable = false)
	private Integer id;

	@NotNull
	@Length(max = 10)
	private String number;

	@NotNull
	@Length(max = 2)
	private String ddd;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getDdd() {
		return ddd;
	}

	public void setDdd(String ddd) {
		this.ddd = ddd;
	}

}
