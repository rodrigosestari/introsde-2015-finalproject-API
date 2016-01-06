package systemlogic.processcentricservices.rest.client;

import java.io.File;
import java.util.Date;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


import org.glassfish.jersey.client.ClientConfig;

import systemlogic.businesslogicservices.dto.goal.Goal;
import systemlogic.businesslogicservices.dto.goal.valutation.Goalview;
import systemlogic.businesslogicservices.dto.goals.Goals;
import util.JaxbUtil;

public class GoalWS {

	static ClientConfig clientConfig = new ClientConfig();
	static Client client = ClientBuilder.newClient(clientConfig);

	public static Goals getGoals(int idperson) {

		WebTarget service = client.target(userinterface.Client.getUri()).path("goal/" + idperson);
		Response response = service.request(MediaType.APPLICATION_XML).accept(MediaType.APPLICATION_XML).get();
		String xml = response.readEntity(String.class);

		// get xsd
		File xsdFile = new File("resource/Goals.xsd");
		// um-marshal Xml into object people,
		Goals goals = (Goals) JaxbUtil.xmlToJaxb("systemlogic.businesslogicservices.dto.goals", xml, xsdFile);
		return goals;

	}
	
	

	public static Goalview getGoalValitation(int idgoal) {

		WebTarget service = client.target(userinterface.Client.getUri()).path("goalValuation/" + idgoal);
		Response response = service.request(MediaType.APPLICATION_XML).accept(MediaType.APPLICATION_XML).get();
		String xml = response.readEntity(String.class);

		// get xsd
		File xsdFile = new File("resource/GoalsValutation.xsd");
		// um-marshal Xml into object people,
		Goalview goals = (Goalview) JaxbUtil.xmlToJaxb("systemlogic.businesslogicservices.dto.goal.valutation", xml,
				xsdFile);
		return goals;

	}

	public static boolean saveGoal(int idperson, String measure, String start, String end,
			String type, String signal, String value) {

		Date dstarr = JaxbUtil.stringToDate(start);
		Date dend = JaxbUtil.stringToDate(end);
		
		Goal goal = new Goal();
		goal.setEnd(JaxbUtil.dateToXmlGregorianCalendar(dend));
		goal.setStart(JaxbUtil.dateToXmlGregorianCalendar(dstarr));
		goal.setSignal(signal);
		goal.setType(type);
		goal.setValue(Float.parseFloat(value));
	
		

		File xsdFile = new File("resource/Goal.xsd");

		String xml = JaxbUtil.jaxbToXml("systemlogic.businesslogicservices.dto.goal", goal, xsdFile);
		WebTarget service = client.target(userinterface.Client.getUri()).path("goal/" + idperson + "/" + measure);

		Response response = service.request(MediaType.APPLICATION_XML).accept(MediaType.APPLICATION_XML)
				.post(Entity.xml(xml));
		xml = response.readEntity(String.class);

		goal = (Goal) JaxbUtil.xmlToJaxb("systemlogic.businesslogicservices.dto.goal", xml, xsdFile);
		if (null != goal) {
			return true;
		}

		return false;
	}

}