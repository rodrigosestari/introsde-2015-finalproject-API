package adapterservice.humanapi.rest.entity;

import adapterservice.humanapi.rest.HumanAPIClient;

/**
 * Blood pressure entity.
 */
public class BloodPressureEntity extends AbstractMeasurementEntity {

    public BloodPressureEntity(HumanAPIClient client) {
        super(client, "/human/blood_pressure");
    }
}
