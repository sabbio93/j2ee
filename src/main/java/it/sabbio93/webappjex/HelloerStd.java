package main.java.it.sabbio93.webappjex;

import javax.annotation.PostConstruct;
import javax.ejb.LocalBean;
import javax.ejb.Singleton;

/**
 * Session Bean implementation class HelloerStd
 */
@Singleton
@LocalBean
public class HelloerStd {

    /**
     * Default constructor. 
     */
    public HelloerStd() {
        // TODO Auto-generated constructor stub
    }
    
    @PostConstruct
    public void ciao()
    {
    	System.out.println("ciao");
    }

}
