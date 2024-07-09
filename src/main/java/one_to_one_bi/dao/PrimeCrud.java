package one_to_one_bi.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import onetoonebi.dto.Country;
import onetoonebi.dto.PrimeMinister;

public class PrimeCrud {
	EntityManager em = Persistence.createEntityManagerFactory("arvind").createEntityManager();
	EntityTransaction et = em.getTransaction();
	public void savePrimeMinister(PrimeMinister minister) {
		et.begin();
		em.persist(minister);
		et.commit();
	}
	public void fetchPrimeMinister(int id) {
		PrimeMinister db = em.find(PrimeMinister.class, id);
		if(db!=null) {
			System.out.println(db);
			System.out.println(db.getCountry());
		}
		else {
			System.out.println("id not found");
		}
	}
}
