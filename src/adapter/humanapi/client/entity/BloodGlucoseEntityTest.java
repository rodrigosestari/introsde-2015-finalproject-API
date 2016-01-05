package adapter.humanapi.client.entity;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.junit.Test;

import adapter.humanapi.rest.HumanAPIClient;
import adapter.humanapi.rest.entity.BloodGlucoseEntity;
import us.monoid.json.JSONArray;
import us.monoid.json.JSONObject;
public class BloodGlucoseEntityTest {

    private BloodGlucoseEntity bloodGlucoseEntity;

    
    public void setUp() throws Exception {
        HumanAPIClient client = new HumanAPIClient();
        //client.setDebug(true);
        bloodGlucoseEntity = client.bloodGlucoseEntity();
    }

    @Test
    public void testLatest() throws Exception {
        JSONObject res = bloodGlucoseEntity.latest();
  
    }

    @Test
    public void testReadings() throws Exception {
        JSONArray res = bloodGlucoseEntity.readings();

        JSONObject obj = res.getJSONObject(0);

    }

    @Test
    public void testReading() throws Exception {
        JSONObject res = bloodGlucoseEntity.reading("52e20cb3fff56aac6200044a");

    }

    @Test
    public void testDaily() throws Exception {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        JSONArray res = bloodGlucoseEntity.daily(df.parse("2014-01-23"));
        
        JSONObject obj = res.getJSONObject(0);

    }

    @Test
    public void testDaily1() throws Exception {

    }
}
