package adapterservice.storageservices.start;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("adapter")
public class MyApplicationConfig extends ResourceConfig {
    public MyApplicationConfig() {
        packages("adapterservice.storageservices.rest.resource");
    }
}
