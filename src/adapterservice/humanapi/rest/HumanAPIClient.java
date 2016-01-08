package adapterservice.humanapi.rest;

import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import org.apache.http.NameValuePair;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIUtils;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.message.BasicNameValuePair;

import adapterservice.humanapi.rest.entity.AppUserEntity;
import adapterservice.humanapi.rest.entity.BloodPressureEntity;
import adapterservice.humanapi.rest.entity.WeightEntity;
import us.monoid.json.JSONArray;
import us.monoid.json.JSONException;
import us.monoid.json.JSONObject;
import us.monoid.web.Resty;
import us.monoid.web.TextResource;

/**
 * HumanAPI client class
 */
public class HumanAPIClient {

	/** URL for accessing the API */
	public static final String apiRoot = "api.humanapi.co/v1";

	/** Logger instance */
	private static Logger logger = Logger.getLogger(HumanAPIClient.class.getName());

	/** Access token for current session */
	private String accessToken;

	/** Debug flag */
	private Boolean debug = false;

	/**
	 * Constructor without params, access token will be taken from
	 * HUMANAPI_ACCESS_TOKEN environment variable
	 */
	public HumanAPIClient() throws HumanAPIException {
		String accessToken = "";
		if (accessToken == null || accessToken.isEmpty()) {
			throw new HumanAPIException("You must create non empty HUMANAPI_ACCESS_TOKEN environment variable");
		}
		this.accessToken = accessToken;
	}

	/**
	 * Constructor, requires access token
	 *
	 * @param accessToken
	 *            access token to be used in the session
	 */
	public HumanAPIClient(String accessToken) throws HumanAPIException {
		if (accessToken == null || accessToken.isEmpty()) {
			throw new HumanAPIException("You must provide non empty `accessToken` parameter");
		}
		this.accessToken = accessToken;
	}

	/**
	 * Set the debug flag. If true, then all request and response details will
	 * be sent to the logger instance.
	 *
	 * @param debug
	 *            new flag value
	 */
	public void setDebug(Boolean debug) {
		this.debug = debug;
	}

	/** Get debug flag */
	public Boolean getDebug() {
		return debug;
	}

	/**
	 * Writes out debug message to logger
	 * 
	 * @param message
	 *            debug message
	 */
	private void debug(String message) {
		if (debug) {
			logger.info(message);
		}
	}

	/**
	 * Execute API GET request and return JSONObject result
	 *
	 * @param path
	 *            path to API resource
	 * @return result returned from server
	 * @throws HumanAPIException
	 */
	public JSONObject execute(String path) throws HumanAPIException {
		Map<String, Object> emptyParams = new HashMap<String, Object>();
		return this.execute(path, emptyParams);
	}

	/**
	 * Execute API GET request and return JSONObject result
	 *
	 * @param path
	 *            path to API resource
	 * @param parameters
	 *            extra parameters
	 * @return result returned from server
	 * @throws HumanAPIException
	 */
	public JSONObject execute(String path, Map<String, Object> parameters) throws HumanAPIException {
		try {
			return new JSONObject(executeBase(path, parameters));
		} catch (JSONException e) {
			throw new HumanAPIException(e);
		}
	}

	/**
	 * Execute API GET request and return JSONObject result
	 *
	 * @param path
	 *            path to API resource
	 * @return result returned from server
	 * @throws HumanAPIException
	 */
	public JSONArray executeForArray(String path) throws HumanAPIException {
		Map<String, Object> emptyParams = new HashMap<String, Object>();
		return this.executeForArray(path, emptyParams);
	}

	/**
	 * Execute API GET request and return JSONArray result
	 *
	 * @param path
	 *            path to API resource
	 * @param parameters
	 *            extra parameters
	 * @return result returned from server
	 * @throws HumanAPIException
	 */
	public JSONArray executeForArray(String path, Map<String, Object> parameters) throws HumanAPIException {
		try {
			return new JSONArray(executeBase(path, parameters));
		} catch (JSONException e) {
			throw new HumanAPIException(e);
		}
	}

	/**
	 * Execute API GET request and return string result
	 *
	 * @param path
	 *            path to API resource
	 * @param parameters
	 *            extra parameters
	 * @return result returned from server
	 * @throws HumanAPIException
	 */
	private String executeBase(String path, Map<String, Object> parameters) throws HumanAPIException {
		String url = apiRoot + path;
		logger.info(String.format("GET %s %s", url, parameters.toString()));
		try {
			// build url

			List<NameValuePair> qparams = new ArrayList<NameValuePair>();
			for (String name : parameters.keySet()) {
				qparams.add(new BasicNameValuePair(name, parameters.get(name).toString()));
			}
			qparams.add(new BasicNameValuePair("access_token", this.accessToken));

			HttpGet httpget = null;
			URI uri = null;
			try {
				uri = URIUtils.createURI("https", apiRoot, -1, path, URLEncodedUtils.format(qparams, "UTF-8"), null);
				httpget = new HttpGet(uri);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println(httpget.getURI());
			String urlText = httpget.getURI().toString();
			debug("complete URL = " + urlText);

			// send req
			Resty resty = new Resty();
			TextResource res = resty.text(urlText);
			debug("result = " + res.toString());

			// check res
			if (!res.status(200)) {
				logger.severe(String.format("Error response: [%d] %s", res.http().getResponseCode(), res.toString()));
				throw new HumanAPIException(String.format("Error response: [%d]", res.http().getResponseCode()));
			}
			logger.info("done, response [200]");
			return res.toString();
		} catch (IOException e) {
			throw new HumanAPIException(e);
		}
	}

	/** Builds BloodPressureEntity */
	public BloodPressureEntity bloodPressureEntity() {
		return new BloodPressureEntity(this);
	}

	/** Builds WeightEntity */
	public WeightEntity weightEntity() {
		return new WeightEntity(this);
	}

	/**
	 * Build AppUserEntity
	 *
	 * @param appId
	 *            Application Id
	 * @param appQueryKey
	 *            Application query key
	 */
	public AppUserEntity appUserEntity(String appId, String appQueryKey) {
		return new AppUserEntity(this, appId, appQueryKey);
	}
}