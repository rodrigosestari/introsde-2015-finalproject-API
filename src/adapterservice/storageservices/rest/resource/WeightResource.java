package adapterservice.storageservices.rest.resource;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

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
import adapterservice.humanapi.rest.entity.WeightEntity;
import systemlogic.businesslogicservices.jaxb.MeasureHistory;
import systemlogic.processcentricservices.rest.client.AdapterWS;
import us.monoid.json.JSONArray;
import us.monoid.json.JSONObject;
import util.JaxbUtil;

@Stateless
@LocalBean
@Path("/Weight")
public class WeightResource {
	// Allows to insert contextual objects into the class,
	// e.g. ServletContext, Request, Response, UriInfo
	@Context
	UriInfo uriInfo;
	@Context
	Request request;

	@GET
	@Path("{personId}/{token}")
	@Produces({ MediaType.TEXT_XML, MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Response getWeight(@PathParam("personId") int personId, @PathParam("token") String token) {
		HumanAPIClient client;
		String um = null;
		String id = null;
		Integer value = null;
		Date date = null;
		MeasureHistory mv = null;
		MeasureHistory.Measure v = null;
		try {
			client = new HumanAPIClient(token);
			client.setDebug(true);		
			 WeightEntity  weightEntity;			
			 weightEntity = client.weightEntity();
		    JSONArray vai = weightEntity.readings();
		    if((null != vai) &&  (vai.length() > 0)){
		    	mv = new MeasureHistory();
		    	for (int i = 0; i < vai.length(); i++) {
					JSONObject obj = vai.getJSONObject(i);
					 um = obj.getString("weight");
					 id = obj.getString("id");
					 value = obj.getInt("value");					 
					 date = JaxbUtil.stringToDate(obj.getString("createdAt"));
					 v = new MeasureHistory.Measure();
					 DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
					 v.setCreated(df.format(date));
					 v.setMeasureType(um);
					 v.setValue(value);
					 v.setIdExt(id+"w");
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