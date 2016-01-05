package adapter.humanapi.rest.entity;

import adapter.humanapi.rest.HumanAPIClient;

/**
 * Blood glucose entity.
 */
public class BloodGlucoseEntity extends AbstractMeasurementEntity {

    public BloodGlucoseEntity(HumanAPIClient client) {
        super(client, "/human/blood_glucose");
    }
}
