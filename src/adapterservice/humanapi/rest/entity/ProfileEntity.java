package adapterservice.humanapi.rest.entity;

import adapterservice.humanapi.rest.HumanAPIClient;
import adapterservice.humanapi.rest.HumanAPIException;
import us.monoid.json.JSONObject;
/**
 * Profile entity.
 */
public class ProfileEntity extends AbstractEntity {

    public ProfileEntity(HumanAPIClient client) {
        super(client);
    }

    public JSONObject get() throws HumanAPIException {
        return client.execute("/human/profile");
    }
}
