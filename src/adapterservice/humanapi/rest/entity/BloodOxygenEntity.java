package adapterservice.humanapi.rest.entity;

import adapterservice.humanapi.rest.HumanAPIClient;

/**
 * Blood oxygen entity.
 */
public class BloodOxygenEntity extends AbstractMeasurementEntity {

    public BloodOxygenEntity(HumanAPIClient client) {
        super(client, "/human/blood_oxygen");
    }
}
