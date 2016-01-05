package adapter.humanapi.rest.entity;

import adapter.humanapi.rest.HumanAPIClient;

/**
 * Body fat entity.
 */
public class BodyFatEntity extends AbstractMeasurementEntity {

    public BodyFatEntity(HumanAPIClient client) {
        super(client, "/human/body_fat");
    }
}
