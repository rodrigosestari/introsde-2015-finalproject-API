package adapterservice.humanapi.rest.entity;

import adapterservice.humanapi.rest.HumanAPIClient;

/**
 * Basic entity class.
 */
public class AbstractEntity {

    protected HumanAPIClient client;

    protected AbstractEntity(HumanAPIClient client) {
        this.client = client;
    }
}
