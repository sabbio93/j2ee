package main.java.it.sabbio93.webappjex;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class Pesister
{

	public void store(Man man)
	{
		System.out.print("ciao");
	}
	
}
