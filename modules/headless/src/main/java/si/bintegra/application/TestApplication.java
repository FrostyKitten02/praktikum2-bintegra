package si.bintegra.application;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ServiceScope;

import javax.ws.rs.*;
import javax.ws.rs.core.Application;



@Component(
        properties = "testApplication.properties",
        scope = ServiceScope.PROTOTYPE,
        service = TestApplication.class
)
@Path("/test")
@Produces("application/json")
public class TestApplication extends Application {

    @GET
    public String working() {
        return "It works!";
    }

    @GET
    @Path("/morning")
    public String hello() {
        return "Good morning!";
    }

    @GET
    @Path("/morning/{name}")
    public String morning(
            @PathParam("name") String name,
            @QueryParam("drink") String drink) {

        String greeting = "Good Morning " + name;

        if (drink != null) {
            greeting += ". Would you like some " + drink + "?";
        }

        return greeting;
    }
}
