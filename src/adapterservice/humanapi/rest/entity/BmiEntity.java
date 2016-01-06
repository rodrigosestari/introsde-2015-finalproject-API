package adapterservice.humanapi.rest.entity;

import adapterservice.humanapi.rest.HumanAPIClient;

/**
 * BMI entity.
 */
public class BmiEntity extends AbstractMeasurementEntity {

    public BmiEntity(HumanAPIClient client) {
        super(client, "/human/bmi");
    }
}
