package br.edu.univas.si5.bd2.orm01;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.edu.univas.si5.bd2.model.Projeto;
import br.edu.univas.si5.bd2.utils.HibernateUtil;

public class ProjetoDAO {

	private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TrabRoberto");
	private static EntityManager entityManager = entityManagerFactory.createEntityManager();

	public static void main(String [] args) {

		
		
// FIND-Dados de um projeto ja inserido no codigo para teste | Id:1;	
//Projeto Projeto = entityManager.find(Projeto.class, 1);
		
//System.out.println("Nome do Projeto:" + Projeto.getNome());
//System.out.println("Nome do Curso do Projeto:" + Projeto.getcurso());
	 

		
//INSERT
//Id é gerado automaticamente pelo Seq_Id_Proj
//Projeto Projeto = new Projeto();
//Projeto.setNome("Projeto Educação Para Crianças");
//Projeto.setcurso("Tecnologia Da Informação");
//		
//entityManager.getTransaction().begin();
//entityManager.persist(Projeto);
//entityManager.getTransaction().commit();
		
//System.out.println("-----------------------------------------------------");		
//System.out.println("Dados do Projeto Inserido");
//System.out.println("Id Gerado pelo SeqId:" + Projeto.getId());
//System.out.println("Nome do Projeto:" + Projeto.getNome());
//System.out.println("Nome do Curso do Projeto:" + Projeto.getcurso());
//System.out.println("-----------------------------------------------------");
		
		

//DELETE			
//Projeto Projeto = entityManager.find(Projeto.class, 3);

//entityManager.getTransaction().begin();
//entityManager.remove(Projeto);
//entityManager.getTransaction().commit();

//System.out.println("-----------------------------------------------------");
//System.out.println("Dados do Projeto Excluido");
//System.out.println("Id Excluido:" + Projeto.getId());
//System.out.println("Nome do Projeto:" + Projeto.getNome());
//System.out.println("Nome do Curso do Projeto:" + Projeto.getcurso());
//System.out.println("-----------------------------------------------------");

		
		
		
// MODIFY	
//Projeto Projeto = new Projeto();
		
//Projeto.setId(1);
//Projeto.setNome("xxxxxxxx");
//Projeto.setcurso("xxxxxxx");

	
//entityManager.getTransaction().begin();
//entityManager.merge(Projeto);
//entityManager.getTransaction().commit();

//System.out.println("-----------------------------------------------------");
//System.out.println("Dados do Projeto Alterado");
//System.out.println("Id Alterado:" + Projeto.getId());
//System.out.println("Nome do Projeto:" + Projeto.getNome());
//System.out.println("Nome do Curso do Projeto:" + Projeto.getcurso());
//System.out.println("-----------------------------------------------------");

	
	
	}
}