package agenda.persistencia.remover;

import javax.persistence.EntityManager;

import agenda.modelo.Contato;
import persistencia.entity.PersistenciaBanco;

public class RemovendoContato {

	public static void main(String[] args) {

		EntityManager em = new PersistenciaBanco().getEntityManager();
		em.getTransaction().begin();

		Contato contato = em.find(Contato.class, 1);

		System.out.print("O Contato " + contato.getNome());
		em.remove(contato);
		System.out.println(", foi removido com sucesso!");
		
		em.getTransaction().commit();
		em.close();
	}

}
