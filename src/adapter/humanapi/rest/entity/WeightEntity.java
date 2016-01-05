package adapter.humanapi.rest.entity;

import adapter.humanapi.rest.HumanAPIClient;

/**
 * Weight entity.
 */
public class WeightEntity extends AbstractMeasurementEntity {

    public WeightEntity(HumanAPIClient client) {
        super(client, "/human/weight");
    }
}
