package adapterservice.humanapi.rest.entity;

import adapterservice.humanapi.rest.HumanAPIClient;

/**
 * Blood glucose entity.
 */
public class BloodGlucoseEntity extends AbstractMeasurementEntity {

    public BloodGlucoseEntity(HumanAPIClient client) {
        super(client, "/human/blood_glucose");
    }
}
