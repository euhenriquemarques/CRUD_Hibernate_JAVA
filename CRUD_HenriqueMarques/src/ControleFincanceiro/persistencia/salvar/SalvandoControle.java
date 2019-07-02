package ControleFincanceiro.persistencia.salvar;

import java.math.BigDecimal;

import javax.persistence.EntityManager;

import ControleFincanceiro.ControleFinanceiro;
import ControleFincanceiro.enumPagamento.ConfirmaPagamento;
import ControleFincanceiro.enumQuinzena.Quinzena;
import agenda.modelo.Contato;
import persistencia.entity.PersistenciaBanco;

public class SalvandoControle {

	public static void main(String[] args) {
		
	
	EntityManager em = new PersistenciaBanco().getEntityManager();
	em.getTransaction().begin();
	
	
	ControleFinanceiro controle = new ControleFinanceiro();
	controle.setDescricao("ALUGUEL");
	controle.setValor(new BigDecimal("743.0"));
	controle.setMes("Julho");
	controle.setPagamaneto(ConfirmaPagamento.SIM);
	controle.setQuinzena(Quinzena.SEGUNDA);
	
	//busco o id do contato e faço o relacionamento entre as duas tabelas chave estrangeira
	Contato contato = em.find(Contato.class, 1);
	controle.setContato(contato);
	
	em.persist(controle);
	
	em.getTransaction().commit();
	em.close();
	


}
}
