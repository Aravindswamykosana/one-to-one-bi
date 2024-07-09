package one_to_one_bi.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import onetoonebi.dto.Country;

public class CountryCrud {
	EntityManager em = Persistence.createEntityManagerFactory("arvind").createEntityManager();
	EntityTransaction et = em.getTransaction();
	public void saveCountry(Country country) {
		et.begin();
		em.persist(country);
		et.commit();
	}
	public void fetchCountry(int id) {
		Country db = em.find(Country.class, id);
		if(db!=null) {
			System.out.println(db);
			System.out.println(db.getMinister());
		}
		else {
			System.out.println("id not found");
		}
	}
}
