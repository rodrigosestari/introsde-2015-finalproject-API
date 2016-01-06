package adapterservice.humanapi.rest.entity;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import adapterservice.humanapi.rest.HumanAPIClient;
import adapterservice.humanapi.rest.HumanAPIException;
import us.monoid.json.JSONArray;
import us.monoid.json.JSONObject;
/**
 * Base class for data types that occur in time periods
 * with a start and end time.
 *
 * These can be things such as a walk, sleep, or location,
 * that start at a certain time and end at a certain time.
 */
public class AbstractPeriodicalEntity extends AbstractEntity {

    /** Path to the entity root (prefix) */
    protected String master;

    protected AbstractPeriodicalEntity(HumanAPIClient client, String master) {
        super(client);
        this.master = master;
    }

    public JSONArray list() throws HumanAPIException {
        return client.executeForArray(master + "/");
    }

    public JSONObject get(String id) throws HumanAPIException {
        return client.execute(master + "/" + id);
    }

    public JSONArray daily() throws HumanAPIException {
        return daily(new Date());
    }

    public JSONArray daily(Date day) throws HumanAPIException {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        return client.executeForArray(master + "/daily/" + df.format(day));
    }

    public JSONObject summary() throws HumanAPIException {
        return summary(new Date());
    }

    public JSONObject summary(Date day) throws HumanAPIException {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        return client.execute(master + "/summary/" + df.format(day));
    }
}
