package adapter.humanapi.client.entity;


import org.junit.Test;

import adapter.humanapi.rest.HumanAPIClient;
import adapter.humanapi.rest.entity.HumanEntity;
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
