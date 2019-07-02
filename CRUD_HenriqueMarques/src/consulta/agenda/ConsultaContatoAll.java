package consulta.agenda;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import agenda.modelo.Contato;
import persistencia.entity.PersistenciaBanco;

public class ConsultaContatoAll {

	public static void main(String[] args) {

		EntityManager em = new PersistenciaBanco().getEntityManager();
		em.getTransaction().begin();

		// REFERE-SE A CLASSE Contato
		String consulta = "Select c from Contato c ";

		// passando para query qual a string que é para executar
		Query query = em.createQuery(consulta);

		// colocando todos os resultados em um lista para poder salvar as informações
		List<Contato> resultado = query.getResultList();

		for (Contato resultadoLista : resultado) {
			System.out.println("------------------------------------------");
			System.out.println("O Contato: " + resultadoLista.getNome() + ", Endereço de E-mail: "
					+ resultadoLista.getEmail() + " e Telefone para Contato: " + resultadoLista.getTelefone());
		}

		
		System.out.println("------------------------------------------");
		System.out.println("------------------ Fim da Busca ---------------------");
		em.getTransaction().commit();
		em.close();
	}
}
