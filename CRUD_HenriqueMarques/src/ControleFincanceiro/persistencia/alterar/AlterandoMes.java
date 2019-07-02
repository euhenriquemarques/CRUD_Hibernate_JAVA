package ControleFincanceiro.persistencia.alterar;

import javax.persistence.EntityManager;

import ControleFincanceiro.ControleFinanceiro;
import persistencia.entity.PersistenciaBanco;

public class AlterandoMes {

	public static void main(String[] args) {

		EntityManager em = new PersistenciaBanco().getEntityManager();

		em.getTransaction().begin();
		ControleFinanceiro controle = em.find(ControleFinanceiro.class, 5);

		System.out.println("");
		System.out.println("");
		System.out.println("------------------------------------------");

		System.out.print("O Mês da despesa " + controle.getDescricao());

		controle.setMes("Agosto");
		
		System.out.println(", foi alterada para  " + controle.getMes() +
				", com sucesso!");

		System.out.println("------------------------------------------");
		System.out.println("");
		System.out.println("");

		em.getTransaction().commit();
		em.close();
	}

}
