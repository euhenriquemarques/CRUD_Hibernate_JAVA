package sysADM.persistencia;

import javax.persistence.EntityManager;

import persistencia.entity.PersistenciaBanco;
import sysADM.confidencial.SysADM;

public class Registro {

	
	public static void main(String[] args) {
		
		
		EntityManager em = new PersistenciaBanco().getEntityManager();
		
		em.getTransaction().begin();
		
		SysADM registro = new SysADM("hsmarques", "@morcego1");
		
		em.persist(registro);
		
		em.getTransaction().commit();
		em.close();
		
		System.out.println("Usuario "+ registro.getLogin()+" Salvo com Sucesso!");
		
	}
}
