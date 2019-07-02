package sysADM.persistencia;

import javax.persistence.EntityManager;

import persistencia.entity.PersistenciaBanco;
import sysADM.confidencial.SysADM;

public class AlterarSenha {

	public static void main(String[] args) {
		
		
		EntityManager em = new PersistenciaBanco().getEntityManager();
		
		em.getTransaction().begin();
		
		SysADM registro = em.find(SysADM.class, 1);
		
		System.out.print("Usuario "+ registro.getLogin());
		
		registro.setSenha("@Morcego1");
		
		System.out.println(" foi Alterado com Sucesso!");
		
		em.getTransaction().commit();
		em.close();
		
		
		
	}
}
