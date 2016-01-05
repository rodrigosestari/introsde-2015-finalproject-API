package adapter.humanapi.rest.entity;

import adapter.humanapi.rest.HumanAPIClient;

/**
 * Heart rate entity.
 */
public class HeartRateEntity extends AbstractMeasurementEntity {

    public HeartRateEntity(HumanAPIClient client) {
        super(client, "/human/heart_rate");
    }
}
