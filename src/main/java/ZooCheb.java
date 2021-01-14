import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;

@Path("zoocheb")
@Produces(MediaType.APPLICATION_JSON)
public class ZooCheb {

    private static final ArrayList<String> baghdad = new ArrayList<String>();

    @GET
    public Response animalsGet(@QueryParam("getAnimal") int id) {
        if (id < 0) {
            return Response.ok(baghdad).build();
        }
        return Response.ok(baghdad.get(id)).build();
    }

    @POST
    public Response animalPost(@QueryParam("newAnimal") String newAnimal) {
        if (newAnimal == null) {
            return Response.status(Response.Status.BAD_REQUEST).build();
        }
        baghdad.add(newAnimal);
        return Response.ok().build();
    }

    @PUT
    public Response animalPut(@QueryParam("id") String newAnimal) {
        return Response.ok().build();

    }

    @DELETE
    public Response animalsEuthanase(@QueryParam("getAnimal") int id) {
        if (id < 0) {return Response.ok(baghdad).build();}
        baghdad.remove(id);
        return Response.ok("Euthanased " + baghdad.get(id)).build();
    }
}