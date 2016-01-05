package adapter.humanapi.rest.entity;

import adapter.humanapi.rest.HumanAPIClient;
import adapter.humanapi.rest.HumanAPIException;
import us.monoid.json.JSONObject;
/**
 * Human entity.
 */
public class HumanEntity extends AbstractEntity {

    public HumanEntity(HumanAPIClient client) {
        super(client);
    }

    public JSONObject get() throws HumanAPIException {
        return client.execute("/human/");
    }
}
