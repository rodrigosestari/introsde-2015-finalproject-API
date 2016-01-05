package adapter.humanapi.client.entity;


import org.junit.Test;

import adapter.humanapi.rest.HumanAPIClient;
import adapter.humanapi.rest.entity.BloodPressureEntity;
import us.monoid.json.JSONObject;
public class BloodPressureEntityTest {

    private BloodPressureEntity bloodPressureEntity;

    
    public void setUp() throws Exception {
        HumanAPIClient client = new HumanAPIClient();
        //client.setDebug(true);
        bloodPressureEntity = client.bloodPressureEntity();
    }

    @Test
    public void testLatest() throws Exception {
        JSONObject res = bloodPressureEntity.latest();

    }
}
