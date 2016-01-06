package adapterservice.humanapi.client.entity;


import org.junit.Test;

import adapterservice.humanapi.rest.HumanAPIClient;
import adapterservice.humanapi.rest.entity.BloodPressureEntity;
import us.monoid.json.JSONObject;
public class BloodPressureEntityTest {

    private BloodPressureEntity bloodPressureEntity;

    
    public void setUp() throws Exception {
        HumanAPIClient client = new HumanAPIClient();
        //client.setDebug(true);
        
        bloodPressureEntity = client.bloodPressureEntity();
        JSONObject res = bloodPressureEntity.latest();
    }

    @Test
    public void testLatest() throws Exception {
        JSONObject res = bloodPressureEntity.latest();

    }
}
