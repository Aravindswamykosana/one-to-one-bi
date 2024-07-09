package onetoonebi.controller;

import javax.persistence.Persistence;

import one_to_one_bi.dao.CountryCrud;
import one_to_one_bi.dao.PrimeCrud;
import onetoonebi.dto.Country;
import onetoonebi.dto.PrimeMinister;

public class CountryMain {
	public static void main(String[] args) {
		Persistence.createEntityManagerFactory("arvind");
		CountryCrud crud=new CountryCrud();
		PrimeCrud pcrud=new PrimeCrud();
//		Country c=new Country("INDIA", 1234521,"peacock", "bengal tiger");
//		PrimeMinister minister=new PrimeMinister("modiji", 78, "male", "BJP");
//		c.setMinister(minister);
//		minister.setCountry(c);
//		crud.saveCountry(c);
//		pcrud.savePrimeMinister(minister);
		
//		crud.fetchCountry(1);
		pcrud.fetchPrimeMinister(1);
	}
}
