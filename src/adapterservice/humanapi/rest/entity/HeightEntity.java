package adapterservice.humanapi.rest.entity;

import adapterservice.humanapi.rest.HumanAPIClient;

/**
 * Height entity.
 */
public class HeightEntity extends AbstractMeasurementEntity {

    public HeightEntity(HumanAPIClient client) {
        super(client, "/human/height");
    }
}
