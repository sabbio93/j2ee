package main.java.it.sabbio93.webappjex;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/** Example resource class hosted at the URI path "/myresource"
 */
@Path("/myresource2")
public class MyResource {	
	
    @GET 
    @Produces("text/plain")
    public String getIt() {
    	EntityManagerFactory factory= Persistence.createEntityManagerFactory("onlyjpaLocal");
		EntityManager em= factory.createEntityManager();
		em.getTransaction().begin();
		Man man = new Man();
		man.setAge(2);
		man.setName("gigi");
		man.setSurname("mio");
		em.persist(man);
		em.close();
		return "fatto";
    }
}
