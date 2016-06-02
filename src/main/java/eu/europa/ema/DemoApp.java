package eu.europa.ema;

import org.glassfish.jersey.server.ResourceConfig;

/**
 * Created by begop on 01/06/2016.
 */
public class DemoApp extends ResourceConfig {
    public DemoApp() {
        packages("eu.europa.ema");
    }
}
