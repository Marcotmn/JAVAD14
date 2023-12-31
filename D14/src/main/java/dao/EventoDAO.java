package dao;

import java.util.List;
import java.util.Set;
import java.util.UUID;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import entities.Concerto;
import entities.Evento;

public class EventoDAO {
	
	private final EntityManager em;
	
	public EventoDAO(EntityManager em) {
		this.em = em;
	}
	
	public void save(Evento s) {

		EntityTransaction t = em.getTransaction();
		t.begin();
		
		em.persist(s); 
		
		t.commit();
		
		System.out.println("Evento salvato correttamente");
	}
	
	public Evento findById(Long id) {
		Evento found = em.find(Evento.class, id);
		return found;
	}
	

	public void findByIdAndDelete(Long id) {
		Evento found = em.find(Evento.class, id);
		if(found != null) {
			EntityTransaction t = em.getTransaction();
			t.begin();
			em.remove(found);
			t.commit();
			System.out.println("Evento eliminato correttamente");
			
		} else {
			System.out.println("Evento non trovato");
	}
	
	
	
}
	
	public void refresh(Long id) {
		Evento found = em.find(Evento.class, id);

		found.setTitolo("BurroCacao");

		System.out.println("PRE REFRESH");
		System.out.println(found);

		em.refresh(found);

		System.out.println("POST REFRESH");
		System.out.println(found);
	}


}