package consulta.ControleFincanceiro;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import ControleFincanceiro.ControleFinanceiro;
import persistencia.entity.PersistenciaBanco;

public class ConsultaAll {

	
	public static void main(String[] args) {
		
		EntityManager em = new PersistenciaBanco().getEntityManager();
		em.getTransaction().begin();
		
		ControleFinanceiro controle = new ControleFinanceiro();
		
		// REFERE-SE A CLASSE ControleFinanceiro
		String consulta = "Select cf from ControleFinanceiro cf ";
		
		// passando para query qual a string que é para executar
		Query query = em.createQuery(consulta);
		
		// colocando todos os resultados em um lista para poder salvar as informações
		List<ControleFinanceiro> resultado = query.getResultList();
		
		for (ControleFinanceiro controleFinanceiro : resultado) {
			
			System.out.println("------------------------------------------");

			System.out.println("A despesa " + controleFinanceiro.getId() + "/" + controleFinanceiro.getDescricao() + ", no valor de "
					+ controleFinanceiro.getValor() + ", referencia para o mês/quinzena de " + controleFinanceiro.getMes() + "/"
					+ controleFinanceiro.getQuinzena() + ", " + controleFinanceiro.getPagamaneto()
					+ " foi paga, e tem como titular o contato de ID " + controleFinanceiro.getContato().getId() + ", com o nome "
					+ controleFinanceiro.getContato().getNome());
		}
		

		
		System.out.println("------------------------------------------");
		System.out.println("------------------ Fim da Busca ---------------------");
		
		
		em.getTransaction().commit();
		em.close();
	}
}
