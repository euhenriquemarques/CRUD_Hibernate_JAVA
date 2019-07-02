package ControleFincanceiro.persistencia.alterar;

import javax.persistence.EntityManager;

import ControleFincanceiro.ControleFinanceiro;
import ControleFincanceiro.enumQuinzena.Quinzena;
import persistencia.entity.PersistenciaBanco;

public class AlterandoQuinzena {

	public static void main(String[] args) {

		EntityManager em = new PersistenciaBanco().getEntityManager();

		em.getTransaction().begin();
		ControleFinanceiro controle = em.find(ControleFinanceiro.class, 5);

		System.out.println("");
		System.out.println("");
		System.out.println("------------------------------------------");

		System.out.print("A Quinzena da despesa " + controle.getDescricao());

		controle.setQuinzena(Quinzena.PRIMEIRA);
		
		System.out.println(", foi alterada para  " + controle.getQuinzena() +
				", com sucesso!");

		System.out.println("------------------------------------------");
		System.out.println("");
		System.out.println("");

		em.getTransaction().commit();
		em.close();
	}

}
