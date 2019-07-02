package agenda.persistencia.alterar;

import javax.persistence.EntityManager;

import agenda.modelo.Contato;
import persistencia.entity.PersistenciaBanco;

public class AlterandoEmail {
	public static void main(String[] args) {
		
		EntityManager em = new PersistenciaBanco().getEntityManager();
		em.getTransaction().begin();
		
		Contato contato = em.find(Contato.class, 1);
		
		System.out.println("O E-mail do Contato "+contato.getNome()+", com o e-mail "+contato.getEmail()+", foi alterado para!");
		contato.setEmail("hssmarques@gmail.com");
		System.out.println(contato.getEmail());
		
		em.getTransaction().commit();
		em.close();
	}

}
