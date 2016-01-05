package adapter.humanapi.rest.entity;

import adapter.humanapi.rest.HumanAPIClient;

/**
 * Blood pressure entity.
 */
public class BloodPressureEntity extends AbstractMeasurementEntity {

    public BloodPressureEntity(HumanAPIClient client) {
        super(client, "/human/blood_pressure");
    }
}
