package adapterservice.humanapi.client.entity;

import java.util.Random;

import adapterservice.humanapi.rest.HumanAPIClient;
import adapterservice.humanapi.rest.entity.AppUserEntity;
import adapterservice.humanapi.rest.entity.BloodPressureEntity;
import us.monoid.json.JSONArray;
import us.monoid.json.JSONObject;

public class AppUserEntityTest {

	private AppUserEntity appUserEntity;

	public static void main(String[] args) {
		AppUserEntityTest m = new AppUserEntityTest();
		try {
			m.setUp();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void setUp() throws Exception {
		HumanAPIClient client = new HumanAPIClient();
		client.setDebug(true);
		JSONObject oi=	client.humanEntity().get();
		  BloodPressureEntity bloodPressureEntity;
	        bloodPressureEntity = client.bloodPressureEntity();
	        JSONArray vai = bloodPressureEntity.readings();
		appUserEntity = client.appUserEntity("3bd364736f46a3204d739686ed4081e28176b83a", // appId
				"3ad773092225631c0f62b2fe09074e77875081a9"); // appQueryKey

		JSONObject see = appUserEntity.get("9f27769595a511ab6a519ca00b1dc1a3b780e78e");
		Random generator = new Random();
		String s = Integer.toString(generator.nextInt(1000) + 1000);
	//res = appUserEntity.create("test_user_" + s);

		JSONArray ar = appUserEntity.list();

		JSONObject obj = ar.getJSONObject(0);
	}

}
