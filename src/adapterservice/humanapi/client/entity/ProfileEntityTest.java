package adapterservice.humanapi.client.entity;


import org.junit.Test;

import adapterservice.humanapi.rest.HumanAPIClient;
import adapterservice.humanapi.rest.entity.ProfileEntity;
import us.monoid.json.JSONObject;
public class ProfileEntityTest {
    @Test
    public void testGet() throws Exception {
        HumanAPIClient client = new HumanAPIClient();
        ProfileEntity profileEntity = client.profileEntity();

        JSONObject res = profileEntity.get();
        
    }
}
