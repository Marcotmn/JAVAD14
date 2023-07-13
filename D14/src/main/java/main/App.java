package main;




import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import entities.Evento;
import dao.EventoDAO;
import entities.tipoEvento;
import util.JpaUtil;


public class App {
	private static EntityManagerFactory emf = JpaUtil.getEntityManagerFactory();

	public static void main(String[] args) {
		
		EntityManager em = emf.createEntityManager();
		
		
		Evento domenicaBellissima = new Evento ("Domenica Bellissima", "2023-08-12", "Domenica Techno", tipoEvento.PRIVATO , 200 );
		EventoDAO sd = new EventoDAO(em);
		
		
		sd.save(domenicaBellissima);
		
		
	
		
		em.close();
		emf.close();
	}

}


