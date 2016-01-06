package adapterservice.humanapi.rest.entity;

import adapterservice.humanapi.rest.HumanAPIClient;

/**
 * Weight entity.
 */
public class WeightEntity extends AbstractMeasurementEntity {

    public WeightEntity(HumanAPIClient client) {
        super(client, "/human/weight");
    }
}
