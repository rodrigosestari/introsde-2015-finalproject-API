package adapter.humanapi.rest.entity;

import adapter.humanapi.rest.HumanAPIClient;

/**
 * Height entity.
 */
public class HeightEntity extends AbstractMeasurementEntity {

    public HeightEntity(HumanAPIClient client) {
        super(client, "/human/height");
    }
}
