package Resources;

import CounterManager.AnimalManager;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("animals")
@Produces(MediaType.APPLICATION_JSON)
public class AnimalsResources {
    @Inject
    private AnimalManager am;

    @GET
    public Response getAll() {
        return Response.ok(am.getAnimals()).build();
    }

    @GET
    public Response getSpecific(@PathParam("id") String id) {
        return Response.ok(am.getSpecificAnimals(id)).build();
    }

    @POST
    public Response create(Animals animals) {
        am.putAnimals(animals);
        return Response.ok(animals).build();
    }

    @DELETE
    public Response euthanise(@QueryParam("id") int xid) {
        euthanise(xid);
        return Response.ok().build();
    }
}
