package adapter.humanapi.rest.entity;

import adapter.humanapi.rest.HumanAPIClient;

/**
 * Sleep entity.
 */
public class SleepEntity extends AbstractPeriodicalEntity {

    public SleepEntity(HumanAPIClient client) {
        super(client, "/human/sleeps");
    }
}
