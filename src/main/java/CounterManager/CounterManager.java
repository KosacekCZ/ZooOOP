package CounterManager;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;

@Path("counter")
@Produces(MediaType.APPLICATION_JSON)

public class CounterManager {
    private int counter;

    public int getCounter() {
        return counter;
    }
    @PUT
    public Response increment() {
        counter++;
        return Response.ok("Boobs++").build();
    }

    @DELETE
    public Response decrement() {
        counter--;
        return Response.ok("Boobs flattered").build();
    }

    @GET
    public Response post() {
        return Response.ok(counter).build();
    }
}
