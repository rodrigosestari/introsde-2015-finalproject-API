package adapter.humanapi.client.entity;

import java.util.Random;

import org.junit.Test;

import adapter.humanapi.rest.HumanAPIClient;
import adapter.humanapi.rest.entity.AppUserEntity;
import us.monoid.json.JSONArray;
import us.monoid.json.JSONObject;
public class AppUserEntityTest {

    private AppUserEntity appUserEntity;

    
    public void setUp() throws Exception {
        HumanAPIClient client = new HumanAPIClient();
        client.setDebug(true);
        appUserEntity = client.appUserEntity(
                "9bac0e053f486619c0795015c99477b49b229961", // appId
                "763af2426481c1e11e75e141d87703372b9f69f8"  // appQueryKey
        );
    }

    @Test
    public void testList() throws Exception {
        JSONArray res = appUserEntity.list();
     
        JSONObject obj = res.getJSONObject(0);
     
    }

    @Test
    public void testGet() throws Exception {
        JSONObject res = appUserEntity.get("770edfcf4ea0c134af0dfd4486ded876");

    }

    @Test
    public void testCreate() throws Exception {
        Random generator = new Random();
        String s = Integer.toString(generator.nextInt(1000) + 1000);

        JSONObject res = appUserEntity.create("test_user_" + s);
   
    }
}
