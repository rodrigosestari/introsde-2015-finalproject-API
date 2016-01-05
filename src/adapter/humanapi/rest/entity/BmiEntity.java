package adapter.humanapi.rest.entity;

import adapter.humanapi.rest.HumanAPIClient;

/**
 * BMI entity.
 */
public class BmiEntity extends AbstractMeasurementEntity {

    public BmiEntity(HumanAPIClient client) {
        super(client, "/human/bmi");
    }
}
