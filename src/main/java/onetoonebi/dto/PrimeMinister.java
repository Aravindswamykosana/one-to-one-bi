package onetoonebi.dto;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.Data;
@Entity
@Data
public class PrimeMinister {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private int age;
	private String gender;
	private String partyName;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn
	private Country country;
	public PrimeMinister(String name, int age, String gender, String partyName) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.partyName = partyName;
	}
	public PrimeMinister() {
		super();
	}
	@Override
	public String toString() {
		return "PrimeMinister [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", partyName="
				+ partyName + "]";
	}
	
}
