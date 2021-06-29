package br.edu.univas.si5.bd2.orm01;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.edu.univas.si5.bd2.model.Participantes;
import br.edu.univas.si5.bd2.model.Projeto;
import br.edu.univas.si5.bd2.utils.HibernateUtil;

public class ParticipantesDAO {

	private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TrabRoberto");
	private static EntityManager entityManager = entityManagerFactory.createEntityManager();

	public static void main(String [] args) {

		
		
//FIND-Dados de um participante ja inserido no codigo para teste | Id:1;
//Participantes Participantes = entityManager.find(Participantes.class, 1);
//
//System.out.println("-----------------------------------------------------");		
//System.out.println("Nome do Particpante:" + Participantes.getNome());
//System.out.println("Data de Nascimento:" + Participantes.getDatanascimento());
//System.out.println("-----------------------------------------------------");		

		
//INSERT
//O id é gerado automaticamente pelo Seq_Id_Particip e a data como timestamp

//Participantes Participantes = new Participantes();
//		
//Participantes.setNome("Roberto");
//Participantes.setDatanascimento(new Date());
//
//entityManager.getTransaction().begin();
//entityManager.persist(Participantes);
//entityManager.getTransaction().commit();
//		
//System.out.println("-----------------------------------------------------");		
//System.out.println("Dados do Participante Inserido");
//System.out.println("Id Gerado pelo SeqId:" + Participantes.getId());
//System.out.println("Nome do Participante:" + Participantes.getNome());
//System.out.println("Data de Nascimento do Participante:" + Participantes.getDatanascimento());
//System.out.println("-----------------------------------------------------");
		
		

//DELETE			
//Participantes Participantes = entityManager.find(Participantes.class, 1);

//entityManager.getTransaction().begin();
//entityManager.remove(Participantes);
//entityManager.getTransaction().commit();

//System.out.println("-----------------------------------------------------");
//System.out.println("Dados do Participante Excluido");
//System.out.println("Id Excluido:" + Participantes.getId());
//System.out.println("Nome do Participante:" + Participantes.getNome());
//System.out.println("Data de Nascimento do Participante:" + Participantes.getDatanascimento());
//System.out.println("-----------------------------------------------------");

		
		
		
// MODIFY	
//Participantes Participantes = new Participantes();

//Participantes.setId(1);
//Participantes.setNome("Douglas");
//Participantes.setDatanascimento(new Date());

//entityManager.getTransaction().begin();
//entityManager.merge(Participantes);
//entityManager.getTransaction().commit();
		
//System.out.println("-----------------------------------------------------");
//System.out.println("Dados do Participante Alterado");
//System.out.println("Id Alterado:" + Participantes.getId());
//System.out.println("Nome do Participante:" + Participantes.getNome());
//System.out.println("Data de Nascimento do Participante:" + Participantes.getDatanascimento());
//System.out.println("-----------------------------------------------------");

	
	}
}