package adapterservice.humanapi.rest.entity;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import adapterservice.humanapi.rest.HumanAPIClient;
import adapterservice.humanapi.rest.HumanAPIException;
import us.monoid.json.JSONArray;
import us.monoid.json.JSONObject;

/**
 * Base class for data types that are discrete measurements and
 * occur at a point in time.
 */
public class AbstractMeasurementEntity extends AbstractEntity {

    /** Path to the entity root (prefix) */
    protected String master;

    protected AbstractMeasurementEntity(HumanAPIClient client, String master) {
        super(client);
        this.master = master;
    }

    public JSONObject latest() throws HumanAPIException {
        return client.execute(master + "/");
    }

    public JSONArray readings() throws HumanAPIException {
        return client.executeForArray(master + "/readings");
    }

    public JSONObject reading(String id) throws HumanAPIException {
        return client.execute(master + "/readings/" + id);
    }

    public JSONArray daily() throws HumanAPIException {
        return daily(new Date());
    }

    public JSONArray daily(Date day) throws HumanAPIException {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        return client.executeForArray(master + "/readings/daily/" + df.format(day));
    }
}
