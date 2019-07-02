package agenda.persistencia.pesquisa;

import javax.persistence.EntityManager;

import agenda.modelo.Contato;
import persistencia.entity.PersistenciaBanco;

public class BuscandoDados {
	
	public static void main(String[] args) {
		
		
		EntityManager em = new PersistenciaBanco().getEntityManager();
		
		em.getTransaction().begin();
		
		
		//colocar o nome da classe e logo em seguida o id
		Contato contato = em.find(Contato.class, 1);
		
		System.out.println("O Contato: " + contato.getNome() + ", Endereço de E-mail: " + contato.getEmail()
				+ " e Telefone para Contato: " + contato.getTelefone());
		
		em.getTransaction().commit();
		em.close();
	}

}
