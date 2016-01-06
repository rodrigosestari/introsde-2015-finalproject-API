package adapterservice.humanapi.client.entity;

import org.junit.Test;

import adapterservice.humanapi.rest.HumanAPIClient;
import adapterservice.humanapi.rest.entity.BloodOxygenEntity;
import us.monoid.json.JSONObject;
public class BloodOxygenEntityTest {

    private BloodOxygenEntity bloodOxygenEntity;

    
    public void setUp() throws Exception {
        HumanAPIClient client = new HumanAPIClient();
        client.setDebug(true);
        bloodOxygenEntity = client.bloodOxygenEntity();
    }

    @Test
    public void testLatest() throws Exception {

        JSONObject res = bloodOxygenEntity.latest();
 
    }
}
