package adapter.humanapi.rest.entity;

import adapter.humanapi.rest.HumanAPIClient;

/**
 * Activity entity.
 */
public class ActivityEntity extends AbstractPeriodicalEntity {

    public ActivityEntity(HumanAPIClient client) {
        super(client, "/human/activities");
    }
}
