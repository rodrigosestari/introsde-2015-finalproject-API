package adapterservice.humanapi.client.entity;


import org.junit.Test;

import adapterservice.humanapi.rest.HumanAPIClient;
import adapterservice.humanapi.rest.entity.GeneticTraitEntity;
import us.monoid.json.JSONArray;
import us.monoid.json.JSONObject;
public class GeneticTraitEntityTest {

    @Test
    public void testList() throws Exception {
        HumanAPIClient client = new HumanAPIClient();
        //client.setDebug(true);
        GeneticTraitEntity geneticTraitEntity = client.geneticTraitEntity();

        JSONArray res = geneticTraitEntity.list();
        
        JSONObject obj = res.getJSONObject(0);
        
    }
}
