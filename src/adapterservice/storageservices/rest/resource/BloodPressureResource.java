package adapterservice.storageservices.rest.resource;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import adapterservice.humanapi.rest.HumanAPIClient;
import adapterservice.humanapi.rest.entity.BloodPressureEntity;
import systemlogic.businesslogicservices.view.MeasureHistoryImportView;
import systemlogic.businesslogicservices.view.MeasureListHistoryImportView;
import systemlogic.processcentricservices.rest.client.AdapterWS;
import us.monoid.json.JSONArray;
import us.monoid.json.JSONObject;

@Stateless
@LocalBean
@Path("/BloodPressure")
public class BloodPressureResource {
	// Allows to insert contextual objects into the class,
	// e.g. ServletContext, Request, Response, UriInfo
	@Context
	UriInfo uriInfo;
	@Context
	Request request;


	@GET
	@Path("{personId}/{token}")
	@Produces({ MediaType.TEXT_XML, MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Response getBloodPressure(@PathParam("personId") int personId, @PathParam("token") String token) {
		HumanAPIClient client;
		String um = null;
		String id = null;
		Integer diastolic = null;
		String date = null;
		MeasureListHistoryImportView mv = null;
		MeasureHistoryImportView v = null;
		
		try {
			client = new HumanAPIClient(token);
			client.setDebug(true);		
			BloodPressureEntity bloodPressureEntity;
		    bloodPressureEntity = client.bloodPressureEntity();
		    JSONArray vai = bloodPressureEntity.readings();
		    if((null != null) &&  (vai.length() > 0)){
		    	mv = new MeasureListHistoryImportView();
		    	for (int i = 0; i < vai.length(); i++) {
					JSONObject obj = vai.getJSONObject(i);
					 um = obj.getString("unit");
					 id = obj.getString("id");
					 diastolic = obj.getInt("diastolic");
					 date = obj.getString("createdAt");
					 DateFormat df = new SimpleDateFormat("yyyy-MM-dd");				     
					 v = new MeasureHistoryImportView();
					 v.setCreated( df.format(date));
					 v.setMeasureType(um);
					 v.setValue(diastolic);
					 v.setId_ext(id+"B");
					 mv.getMeasure().add(v);
				}
		    	if (AdapterWS.sendMeasures(personId, mv)){
		    		return Response.ok().build();
		    	}else{
		    		return Response.serverError().build();
		    	}
		    }else{
		    	return Response.status(Response.Status.NOT_FOUND).build();
		    }
		    
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return Response.serverError().build();
		
		}
			
	}
	
		
}