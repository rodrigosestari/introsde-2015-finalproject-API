package adapterservice.storageservices.rest.resource;

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
import us.monoid.json.JSONArray;
import us.monoid.json.JSONObject;

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
	@Path("{token}")
	@Produces({ MediaType.TEXT_XML, MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Response getHeight(@PathParam("token") String token) {
		HumanAPIClient client;
		String um = null;
		Integer value = null;
		String date = null;
		
		try {
			client = new HumanAPIClient(token);
			client.setDebug(true);		
			 WeightEntity  weightEntity;			
			 weightEntity = client.weightEntity();
		    JSONArray vai = weightEntity.readings();
		    if((null != null) &&  (vai.length() > 0)){
		    	for (int i = 0; i < vai.length(); i++) {
					JSONObject obj = vai.getJSONObject(i);
					 um = obj.getString("unit");
					 value = obj.getInt("value");
					 date = obj.getString("createdAt");
				}
		    }else{
		    	return Response.status(Response.Status.NOT_FOUND).build();
		    }
		    return Response.ok().build();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return Response.serverError().build();
		
		}
			
	}
	
	
}