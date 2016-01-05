package adapter.humanapi.rest.entity;

import adapter.humanapi.rest.HumanAPIClient;

/**
 * Location entity.
 */
public class LocationEntity extends AbstractPeriodicalEntity {

    public LocationEntity(HumanAPIClient client) {
        super(client, "/human/locations");
    }
}
