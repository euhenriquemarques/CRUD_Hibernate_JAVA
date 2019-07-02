package persistencia.entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PersistenciaBanco {
	
	
	//para ter apenas uma instancia em memoria do entityManagerFactory em memoria colocamos o private static
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("AgendaHSMarques");
	
	public EntityManager getEntityManager(){
		return emf.createEntityManager();
	}

}
