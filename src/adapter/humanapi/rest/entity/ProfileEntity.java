package adapter.humanapi.rest.entity;

import adapter.humanapi.rest.HumanAPIClient;
import adapter.humanapi.rest.HumanAPIException;
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
