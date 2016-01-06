package adapterservice.humanapi.client;



import adapterservice.humanapi.rest.HumanAPIClient;
public class HumanAPIClientTest {

    public void testConstructorSuccess() throws Exception {
        HumanAPIClient client = new HumanAPIClient("test");
        
    }

    

    public void testConstructorSuccessEnv() throws Exception {
        HumanAPIClient client = new HumanAPIClient();
    
    }
}
