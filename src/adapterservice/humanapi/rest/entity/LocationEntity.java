package adapterservice.humanapi.rest.entity;

import adapterservice.humanapi.rest.HumanAPIClient;

/**
 * Location entity.
 */
public class LocationEntity extends AbstractPeriodicalEntity {

    public LocationEntity(HumanAPIClient client) {
        super(client, "/human/locations");
    }
}
