package adapterservice.humanapi.client.entity;


import org.junit.Test;

import adapterservice.humanapi.rest.HumanAPIClient;
import adapterservice.humanapi.rest.entity.HumanEntity;
import us.monoid.json.JSONObject;
public class HumanEntityTest {
    @Test
    public void testGet() throws Exception {
        HumanAPIClient client = new HumanAPIClient();
        //client.setDebug(true);
        HumanEntity humanEntity = client.humanEntity();

        JSONObject res = humanEntity.get();
        
    }
}
