package endpoints;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/test")
public class TestEndpoint {

    @GET
    @Consumes(MediaType.TEXT_XML)
    public String sayHello(){
        String response = "<?xml version='1.0'?>" +
                "<hello>Hello Bitch</hello>";
        return response;
    }
}
