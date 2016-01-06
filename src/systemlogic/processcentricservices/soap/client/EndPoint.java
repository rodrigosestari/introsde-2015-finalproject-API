package systemlogic.processcentricservices.soap.client;

import java.util.ArrayList;

import systemlogic.processcentricservices.soap.sw.MeasureHistoryView;
import systemlogic.processcentricservices.soap.sw.MeasureTypesView;
import systemlogic.processcentricservices.soap.sw.PeopleView;
import systemlogic.processcentricservices.soap.sw.PersonDto;
import userinterface.Client;

public class EndPoint {

	public static PersonDto peopleExist(Long idPerson) {
		PersonDto person = null;
		try {
			person = Client.getHealth().readPerson(idPerson);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			person = null;
			e.printStackTrace();
		}
		return person;
	}

	public static ArrayList<Integer> idPeople() {
		ArrayList<Integer> result = null;
		PeopleView people = null;

		try {
			people = Client.getHealth().getPeople();
			if (null != people) {
				result = new ArrayList<>();
				for (PeopleView.Person p : people.getPerson()) {
					result.add(p.getIdPerson());
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			result = null;
			e.printStackTrace();
		}
		return result;
	}

	public static MeasureHistoryView personHistory(
			Long idPerson, String type) {
		MeasureHistoryView history = null;
		try {
			history = Client.getHealth().readPersonHistory(idPerson, type);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			history = null;
			e.printStackTrace();
		}
		return history;
	}
	
	public static ArrayList<String> measureType(){		
		MeasureTypesView me = null;
		try {
			me = Client.getHealth().readMeasureTypes();
			if (null != me){
				return (ArrayList<String>) me.getMeasureType();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block			
			e.printStackTrace();
		}
		return null;
	}
	
	public static boolean saveMeasure( Long personId,String measure, Float value,String data){		
		MeasureHistoryView me = null;
		try {
			me = Client.getHealth().savePersonMeasure(personId, measure, value, data);
			if (null != me){
				return true;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block			
			e.printStackTrace();
		}
		return false;
	}
	

}
