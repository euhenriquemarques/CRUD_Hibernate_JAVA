package ControleFincanceiro.persistencia.pesquisa;

import javax.persistence.EntityManager;

import ControleFincanceiro.ControleFinanceiro;
import persistencia.entity.PersistenciaBanco;

public class BuscandoControle {

	public static void main(String[] args) {

		EntityManager em = new PersistenciaBanco().getEntityManager();
		em.getTransaction().begin();

		ControleFinanceiro controle = em.find(ControleFinanceiro.class, 5);
		
		System.out.println("");
		System.out.println("");
		System.out.println("------------------------------------------");
		
		System.out.println("A despesa " + controle.getId() + "/" + controle.getDescricao() + ", no valor de "
				+ controle.getValor() + ", referencia para o mês/quinzena de " + controle.getMes() +"/"+controle.getQuinzena()+ ", "
				+ controle.getPagamaneto() + " foi paga, e tem como titular o contato de ID " + controle.getContato().getId() + ", com o nome " + controle.getContato().getNome());
		
		System.out.println("------------------------------------------");
		System.out.println("");
		System.out.println("");
		
		em.getTransaction().commit();
		em.close();
	}
}
