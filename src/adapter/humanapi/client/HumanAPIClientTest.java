package adapter.humanapi.client;

import org.junit.Test;

import adapter.humanapi.rest.HumanAPIClient;
public class HumanAPIClientTest {
    @Test
    public void testConstructorSuccess() throws Exception {
        HumanAPIClient client = new HumanAPIClient("test");
        
    }

    
    @Test
    public void testConstructorSuccessEnv() throws Exception {
        HumanAPIClient client = new HumanAPIClient();
    
    }
}
