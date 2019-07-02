package agenda.persistencia.salvar;

import javax.persistence.EntityManager;

import agenda.modelo.Contato;
import persistencia.entity.PersistenciaBanco;

public class SalvandoContato {

	public static void main(String[] args) {
		
		
		Contato contato = new Contato();
		contato.setNome("Jéssica Moura");
		contato.setTelefone("18 99117-1275");
		contato.setEmail("jessik-oliveira@hotmail.com");
		
		
		EntityManager em = new PersistenciaBanco().getEntityManager();
		
		em.getTransaction().begin();
		em.persist(contato);
		
		em.getTransaction().commit();
		
		em.close();
		
	}
}
