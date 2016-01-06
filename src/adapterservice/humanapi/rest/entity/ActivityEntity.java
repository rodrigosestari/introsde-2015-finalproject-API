package adapterservice.humanapi.rest.entity;

import adapterservice.humanapi.rest.HumanAPIClient;

/**
 * Activity entity.
 */
public class ActivityEntity extends AbstractPeriodicalEntity {

    public ActivityEntity(HumanAPIClient client) {
        super(client, "/human/activities");
    }
}
