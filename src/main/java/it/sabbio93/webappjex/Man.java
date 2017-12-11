package main.java.it.sabbio93.webappjex;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the Man database table.
 * 
 */
@Entity
@NamedQuery(name="Man.findAll", query="SELECT m FROM Man m")
public class Man implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Surname")
	private String surname;

	private int age;

	@Column(name="Name")
	private String name;

	public Man() {
	}

	public String getSurname() {
		return this.surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}