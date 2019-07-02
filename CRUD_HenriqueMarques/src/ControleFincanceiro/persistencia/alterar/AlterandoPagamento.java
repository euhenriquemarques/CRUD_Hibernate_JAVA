package ControleFincanceiro.persistencia.alterar;

import javax.persistence.EntityManager;

import ControleFincanceiro.ControleFinanceiro;
import ControleFincanceiro.enumPagamento.ConfirmaPagamento;
import persistencia.entity.PersistenciaBanco;

public class AlterandoPagamento {

	
	public static void main(String[] args) {
		
		EntityManager em = new PersistenciaBanco().getEntityManager();
		em.getTransaction().begin();
		
		ControleFinanceiro controle = em.find(ControleFinanceiro.class, 5);
		
		//informar se foi paga com SIM ou se ainda consta em Aberto NAO
		controle.setPagamaneto(ConfirmaPagamento.SIM);
		
		
		System.out.println("");
		System.out.println("");
		System.out.println("------------------------------------------");
		
		System.out.println("A despesa " + controle.getId() + "/" + controle.getDescricao() + ", no valor de "
				+ controle.getValor() + ", referencia para o mês de " + controle.getMes() + ", "
				+ controle.getPagamaneto() + " foi paga, e tem como titular o contato de ID " + controle.getContato().getId() + ", com o nome " + controle.getContato().getNome());
		
		System.out.println("------------------------------------------");
		System.out.println("");
		System.out.println("");
		
		em.getTransaction().commit();
		em.close();
		
	}
}
