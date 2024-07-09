package onetoonebi.dto;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data
public class Country{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private long population;
	private String nationalBird;
	private String nationalAnimal;
	@OneToOne(cascade = CascadeType.ALL,mappedBy = "country")
	private PrimeMinister minister;
	public Country(String name, long population, String nationalBird, String nationalAnimal) {
		super();
		this.name = name;
		this.population = population;
		this.nationalBird = nationalBird;
		this.nationalAnimal = nationalAnimal;
	}
	public Country() {
		super();
	}
	public String toString() {
		return "Country [id=" + id + ", name=" + name + ", population=" + population + ", nationalBird=" + nationalBird
				+ ", nationalAnimal=" + nationalAnimal + "]";
	}
	
}
