package ControleFincanceiro.persistencia.remover;

import javax.persistence.EntityManager;

import ControleFincanceiro.ControleFinanceiro;
import persistencia.entity.PersistenciaBanco;

public class RemovendoControle {

	public static void main(String[] args) {

		EntityManager em = new PersistenciaBanco().getEntityManager();
		em.getTransaction().begin();

		ControleFinanceiro controle = em.find(ControleFinanceiro.class, 4);

		System.out.println("");
		System.out.println("------------------------------------------");
		System.out.print("A despesa " + controle.getDescricao());
		em.remove(controle);
		System.out.println(", foi removido com sucesso!");
		System.out.println("------------------------------------------");
		System.out.println("");

		em.getTransaction().commit();
		em.close();

	}
}
