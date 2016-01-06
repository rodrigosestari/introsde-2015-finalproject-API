package adapterservice.humanapi.rest.entity;

import adapterservice.humanapi.rest.HumanAPIClient;

/**
 * Heart rate entity.
 */
public class HeartRateEntity extends AbstractMeasurementEntity {

    public HeartRateEntity(HumanAPIClient client) {
        super(client, "/human/heart_rate");
    }
}
