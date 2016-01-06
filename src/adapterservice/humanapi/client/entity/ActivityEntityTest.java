package adapterservice.humanapi.client.entity;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import adapterservice.humanapi.rest.HumanAPIClient;
import adapterservice.humanapi.rest.entity.ActivityEntity;
import us.monoid.json.JSONArray;
import us.monoid.json.JSONObject;
public class ActivityEntityTest {

    private ActivityEntity activityEntity;

    
    public void setUp() throws Exception {
        HumanAPIClient client = new HumanAPIClient();
        //client.setDebug(true);
        activityEntity = client.activityEntity();
    }


    public void testList() throws Exception {
        JSONArray res = activityEntity.list();

        JSONObject obj = res.getJSONObject(0);

    }

    
    public void testGet() throws Exception {
        JSONObject res = activityEntity.get("52e20cb5fff56aac62000b73");

    }

    
    public void testDaily() throws Exception {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        JSONArray res = activityEntity.daily(df.parse("2014-01-24"));
        JSONObject obj = res.getJSONObject(0);

    }

    
    public void testSummary() throws Exception {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        JSONObject res = activityEntity.summary(df.parse("2014-01-24"));

    }
}
