package main.java.it.sabbio93.webappjex;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jms.JMSContext;
import javax.jms.Queue;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Stateless
@Path("/sendMsg")
public class SendMessage 
{
	@Inject
	private JMSContext context;
	
	@Resource(lookup="java:/jms/queue/request")
	private Queue queue;
	
	@GET
	@Produces("text/plain")
	public String resp()
	{
		context.createProducer().send(queue, "Hello Bello");
		return "use POST to send message";
	}
}
