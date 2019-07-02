package agenda.persistencia.alterar;

import javax.persistence.EntityManager;

import agenda.modelo.Contato;
import persistencia.entity.PersistenciaBanco;

public class AlterarNome {

	public static void main(String[] args) {

		EntityManager em = new PersistenciaBanco().getEntityManager();
		em.getTransaction().begin();

		Contato contato = em.find(Contato.class, 1);

		System.out.println("O Nome " + contato.getNome() + ", foi alterado para!");

		contato.setNome("Henrique Marques");
		
		System.out.println(contato.getNome());

		em.getTransaction().commit();
		em.close();

	}

}
