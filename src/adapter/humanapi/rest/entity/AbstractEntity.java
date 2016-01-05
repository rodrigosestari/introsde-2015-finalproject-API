package adapter.humanapi.rest.entity;

import adapter.humanapi.rest.HumanAPIClient;

/**
 * Basic entity class.
 */
public class AbstractEntity {

    protected HumanAPIClient client;

    protected AbstractEntity(HumanAPIClient client) {
        this.client = client;
    }
}
