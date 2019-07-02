package sysADM.persistencia;

import javax.persistence.EntityManager;

import persistencia.entity.PersistenciaBanco;
import sysADM.confidencial.SysADM;

public class Exclusao {

	public static void main(String[] args) {
		
		
		EntityManager em = new PersistenciaBanco().getEntityManager();
		
		em.getTransaction().begin();
		
		SysADM registro = em.find(SysADM.class, 3);
		
		System.out.print("Usuario "+ registro.getLogin());
		
		em.remove(registro);
		
		System.out.println(" foi excluido com Sucesso!");
		
		em.getTransaction().commit();
		em.close();
		
		
		
	}
}
