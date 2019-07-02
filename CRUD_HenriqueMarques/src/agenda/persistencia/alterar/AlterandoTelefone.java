package agenda.persistencia.alterar;

import javax.persistence.EntityManager;

import agenda.modelo.Contato;
import persistencia.entity.PersistenciaBanco;

public class AlterandoTelefone {

	public static void main(String[] args) {

		EntityManager em = new PersistenciaBanco().getEntityManager();
		em.getTransaction().begin();

		Contato contato = em.find(Contato.class, 1);
		System.out.println("O Telefone do contato " + contato.getNome() + ", com o numero " + contato.getTelefone()
				+ ", foi alterador para!");

		contato.setTelefone("18 99140-3108");
		System.out.println(contato.getTelefone());

		em.getTransaction().commit();
		em.close();
	}

}
