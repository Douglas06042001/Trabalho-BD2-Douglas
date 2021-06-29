package br.edu.univas.si5.bd2.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "participantes")

public class Participantes {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="Idgenerator")
	@SequenceGenerator(name="Idgenerator",sequenceName="Seq_Id_Particip",allocationSize=1)
	@Column(name = "id")
    private int id;
	
	@Column(name = "nome")
    private String nome;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "datanascimento")
    private Date datanascimento;
    


    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date  getDatanascimento() {
		return datanascimento;
	}
	public void setDatanascimento(Date  date) {
		this.datanascimento = date;
	}
	
         
         
}    
         
         