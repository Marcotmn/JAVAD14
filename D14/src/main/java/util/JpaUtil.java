package util;

import javax.persistence.Persistence;
import javax.persistence.EntityManagerFactory;

public class JpaUtil {
	private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("D14");
	public static EntityManagerFactory getEntityManagerFactory() {
		return emf;
	}
}
