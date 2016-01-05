package adapter.humanapi.rest.entity;

import adapter.humanapi.rest.HumanAPIClient;

/**
 * Blood oxygen entity.
 */
public class BloodOxygenEntity extends AbstractMeasurementEntity {

    public BloodOxygenEntity(HumanAPIClient client) {
        super(client, "/human/blood_oxygen");
    }
}
