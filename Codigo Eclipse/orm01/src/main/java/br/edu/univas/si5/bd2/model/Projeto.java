package br.edu.univas.si5.bd2.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "projeto")
public class Projeto implements Serializable {

	@Id

	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="Idgenerator")
	@SequenceGenerator(name="Idgenerator",sequenceName="Seq_Id_Proj",allocationSize=1)
	@Column(name = "id")
	private Integer id;

	@Column(name = "nome")
	private String nome;

	@Column(name = "curso")
	private String curso;

	public Projeto() {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer codigo) {
		this.id = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getcurso() {
		return curso;
	}

	public void setcurso(String curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "Cargo [id=" + id + ", nome=" + nome + ", curso=" + curso + "]";
	}

}
