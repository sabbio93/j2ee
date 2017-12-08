package main.java.it.sabbio93.webappjex;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 * Message-Driven Bean implementation class for: Reciver
 */
@MessageDriven(
		activationConfig = {
				@ActivationConfigProperty(propertyName="destinationLookup", propertyValue="java:/jms/queue/request"),
				@ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue")
		})
public class Reciver implements MessageListener {

    /**
     * Default constructor. 
     */
    public Reciver() {
        // TODO Auto-generated constructor stub
    }
	
	/**
     * @see MessageListener#onMessage(Message)
     */
    public void onMessage(Message message) {
       try {
		System.out.println("Recived "+((TextMessage)message).getText());
	} catch (JMSException e) {
		e.printStackTrace();
	}
    }

}
