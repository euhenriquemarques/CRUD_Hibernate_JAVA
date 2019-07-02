package ControleFincanceiro.persistencia.alterar;

import javax.persistence.EntityManager;

import ControleFincanceiro.ControleFinanceiro;
import persistencia.entity.PersistenciaBanco;

public class AlterandoDescricao {

	public static void main(String[] args) {

		EntityManager em = new PersistenciaBanco().getEntityManager();
		em.getTransaction().begin();

		ControleFinanceiro controle = em.find(ControleFinanceiro.class, 5);

		System.out.println("");
		System.out.println("");
		System.out.println("------------------------------------------");

		System.out.print("A Descricao da despesa " + controle.getDescricao());
		
		controle.setDescricao("UNIP");
		
		System.out.println(", foi alterada para  " + controle.getDescricao() + ", com sucesso!");
		System.out.println("------------------------------------------");

		System.out.println("");
		System.out.println("");

		em.getTransaction().commit();
		em.close();
	}

}
