package adapter.humanapi.rest.entity;

import adapter.humanapi.rest.HumanAPIClient;
import adapter.humanapi.rest.HumanAPIException;
import us.monoid.json.JSONArray;
/**
 * Genetic trait entity.
 */
public class GeneticTraitEntity extends AbstractEntity {

    public GeneticTraitEntity(HumanAPIClient client) {
        super(client);
    }

    public JSONArray list() throws HumanAPIException {
        return client.executeForArray("/human/genetic/traits");
    }
}
