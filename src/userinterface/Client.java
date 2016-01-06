package userinterface;

import java.net.URI;
import java.net.URL;
import java.util.Scanner;

import javax.ws.rs.core.UriBuilder;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import systemlogic.businesslogicservices.dto.goal.valutation.Goalview;
import systemlogic.businesslogicservices.dto.goals.Goals;
import systemlogic.processcentricservices.rest.client.GoalWS;
import systemlogic.processcentricservices.soap.client.EndPoint;
import systemlogic.processcentricservices.soap.sw.Health;
import systemlogic.processcentricservices.soap.sw.MeasureHistoryView;
import systemlogic.processcentricservices.soap.sw.PersonDto;

public class Client {

	static URL url = null;
	static QName qname = null;
	static Service service = null;
	static Health health = null;
	static URI uri = null;
	static String type = "";
	static Integer idPerson = null;

	public static void main(String[] args) throws Exception {
		setUrl(new URL("http://rodrigo-sestari-final-soap.herokuapp.com/ws/health?wsdl"));
		setQname(new QName("http://sw.soap.processcentricservices.systemlogic/", "HealthService"));
		setService(Service.create(url, qname));
		setHealth(getService().getPort(Health.class));
		setUri(UriBuilder.fromUri("http://rodrigo-sestari-final-rest.herokuapp.com/finalprojectrest/").build());

		System.out.println("Rodrigo Joni Sestari");
		String input = "";
		while (!input.equals("exit")) {
			if (null == idPerson) {
				System.out.println("1 - List id all People");
				System.out.println("2 - Enter person");
				System.out.println("e - exit");
				type = scanner();
				switch (type) {

				case "1": {
					System.out.println(EndPoint.idPeople());
				}
					break;
				case "2": {
					System.out.print("Person id: ");
					type = scanner();
					try {
						PersonDto p = EndPoint.peopleExist(Long.parseLong(type));
						if (null != p) {
							idPerson = p.getIdPerson();
						}
					} catch (Exception e) {
						idPerson = null;
					}

				}
					break;
				case "e": {
					input = "exit";
				}
					break;
				default:
					input = "exit";
					break;
				}
			} else {
				System.out.println("1 - get measute types");
				System.out.println("2 - get measute history");
				System.out.println("3 - savve measute");
				System.out.println("4 - get Goals");
				System.out.println("5 - get goal valitation");
				System.out.println("6 - create goal");
				System.out.println("e - exit");
				type = scanner();

				switch (type) {

				case "2": {
					System.out.print("measure: ");
					String pmeasure = scanner();
					try {
						MeasureHistoryView mv = EndPoint.personHistory(Long.valueOf(idPerson), pmeasure);
						if (null != mv) {
							for (MeasureHistoryView.Measure m : mv.getMeasure()) {
								System.out.println(m.toString());
							}

						}
					} catch (Exception e) {

					}

				}
					break;
				case "1": {
					System.out.println(EndPoint.measureType());
				}
					break;
				case "3": {
					boolean result = false;
					try {
						System.out.print("measure: ");
						String pmeasure = scanner();

						System.out.print("value: ");
						String pvalue = scanner();

						System.out.print("data: ");
						String pdta = scanner();
						result = EndPoint.saveMeasure(Long.valueOf(idPerson), pmeasure, Float.parseFloat(pvalue), pdta);
					} catch (Exception e) {
						result = false;
					}

					if (result) {
						System.out.print("measure salved!");
					} else {
						System.out.print("error");
					}
				}
					break;
				case "4": {
					try {
						Goals glist = GoalWS.getGoals(idPerson);
						if (null != glist) {
							for (Goals.Goal goal : glist.getGoal()) {
								System.out.println(goal.toString());
							}

						}
					} catch (Exception e) {
						System.out.print("error");
					}

				}
					break;
				case "5": {
					try {
						System.out.print("ID goal: ");
						String idgoal = scanner();
						Goalview goal = GoalWS.getGoalValitation(Integer.parseInt(idgoal));
						if (null != goal) {
							System.out.print(goal.toString());

						}
					} catch (Exception e) {
						System.out.print("error");
					}

				}
					break;
				case "6": {
					try {
						System.out.print("measure: ");
						String measure = scanner();
						System.out.print("Start date: ");
						String start = scanner();
						System.out.print("end date: ");
						String end = scanner();
						System.out.print("type (DAILY, MONTHLY): ");
						String type = scanner();
						System.out.println("signal (LESS, EQUAL, GRATER, LESS_EQUAL, GRATER_EQUAL): ");
						System.out.print("signal (LESS_SUM, EQUAL_SUM, GRATER_SUM, LESS_EQUAL_SUM, GRATER_EQUAL_SUM): ");
						
						String signal = scanner();
						System.out.print("value: ");
						String value = scanner();

						boolean result = GoalWS.saveGoal(idPerson, measure, start, end, type, signal, value);
						if (result) {
							System.out.println("goal created");

						} else {
							System.out.println("error");
						}
					} catch (Exception e) {
						System.out.println("error");
					}

				}
					break;
				case "e": {
					input = "exit";
				}
					break;
				default:
					input = "exit";
					break;
				}
			}

		}

	}

	public static String scanner() {
		Scanner input = new Scanner(System.in);
		String writeSomething = input.nextLine();
		return writeSomething;
	}

	public static URL getUrl() {
		return url;
	}

	public static QName getQname() {
		return qname;
	}

	public static Service getService() {
		return service;
	}

	public static Health getHealth() {
		return health;
	}

	public static void setUrl(URL url) {
		Client.url = url;
	}

	public static void setQname(QName qname) {
		Client.qname = qname;
	}

	public static void setService(Service service) {
		Client.service = service;
	}

	public static void setHealth(Health health) {
		Client.health = health;
	}

	public static URI getUri() {
		return uri;
	}

	public static void setUri(URI uri) {
		Client.uri = uri;
	}

}
