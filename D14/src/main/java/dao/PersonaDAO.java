package dao;

import java.util.UUID;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import entities.Persona;

public class PersonaDAO {
	
	private final EntityManager em;
	
	public PersonaDAO(EntityManager em) {
		this.em = em;
	}
	
	public void save(Persona s) {

		EntityTransaction t = em.getTransaction();
		t.begin();
		
		em.persist(s); 
		
		t.commit();
		
		System.out.println("Persona salvata correttamente");
	}
	
	public Persona findById(Long id) {
		Persona found = em.find(Persona.class, id);
		return found;
	}
	

	public void findByIdAndDelete(Long id) {
		Persona found = em.find(Persona.class, id);
		if(found != null) {
			EntityTransaction t = em.getTransaction();
			t.begin();
			em.remove(found);
			t.commit();
			System.out.println("Persona eliminata correttamente");
			
		} else {
			System.out.println("Persona non trovato");
	}
	
	
	
}
	
	public void refresh(Long id) {
		Persona found = em.find(Persona.class, id);

		found.setNome("BurroCacao");

		System.out.println("PRE REFRESH");
		System.out.println(found);

		em.refresh(found);

		System.out.println("POST REFRESH");
		System.out.println(found);
	}

	

}