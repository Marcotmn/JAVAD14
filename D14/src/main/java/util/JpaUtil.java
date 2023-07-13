package util;

import javax.persistence.Persistence;
import javax.persistence.EntityManagerFactory;

public class JpaUtil {
	private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("u4D12");
	public static EntityManagerFactory getEntityManagerFactory() {
		return emf;
	}
}
