package main.java.it.sabbio93.webappjex;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Man
 *
 */
@Entity
public class Man implements Serializable {

	
	private String Name;   
	@Id
	private String Surname;
	private int age;
	private static final long serialVersionUID = 1L;

	public Man() {
		super();
	}   
	public String getName() {
		return this.Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}   
	public String getSurname() {
		return this.Surname;
	}

	public void setSurname(String Surname) {
		this.Surname = Surname;
	}   
	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}
   
}
