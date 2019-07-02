package ControleFincanceiro.persistencia.alterar;

import java.math.BigDecimal;

import javax.persistence.EntityManager;

import ControleFincanceiro.ControleFinanceiro;
import persistencia.entity.PersistenciaBanco;

public class AlterandoValor {

	public static void main(String[] args) {


		EntityManager em = new PersistenciaBanco().getEntityManager();
		
		em.getTransaction().begin();
		ControleFinanceiro controle = em.find(ControleFinanceiro.class, 5);
		
		System.out.println("");
		System.out.println("");
		System.out.println("------------------------------------------");
		
		
		System.out.print("O Valor da despesa " + controle.getDescricao());

		controle.setValor(new BigDecimal("750.0"));
		
		System.out.println(", foi alterada para  " + controle.getValor() +
				", com sucesso!");
		
		System.out.println("------------------------------------------");
		System.out.println("");
		System.out.println("");
		
		em.getTransaction().commit();
		em.close();
		
		
	}

}
