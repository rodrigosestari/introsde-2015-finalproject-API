package adapterservice.humanapi.rest.entity;

import adapterservice.humanapi.rest.HumanAPIClient;

/**
 * Sleep entity.
 */
public class SleepEntity extends AbstractPeriodicalEntity {

    public SleepEntity(HumanAPIClient client) {
        super(client, "/human/sleeps");
    }
}
