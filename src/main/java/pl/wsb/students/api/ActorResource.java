package pl.wsb.students.api;

import pl.wsb.students.consts.ApiEndpoints;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path(ApiEndpoints.ACTOR)
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ActorResource {
    @GET
    public Response getActor(@QueryParam(ApiEndpoints.PARAM_LIMIT) Integer limit, @QueryParam(ApiEndpoints.PARAM_OFFSET) Integer offset, @QueryParam(ApiEndpoints.PARAM_SEARCH) String search)
    {        return Response.status(Response.Status.OK).entity("mock call ok...").build();
    }
    @PUT
    @Path(ApiEndpoints.ACTOR_ADD)
    public Response putActor(Integer id) {
        return Response.status(Response.Status.OK).entity("mock call ok...").build();
    }
    @DELETE
    @Path(ApiEndpoints.ACTOR_DEL)
    public Response deleteActor(Integer id) {
        return Response.status(Response.Status.OK).entity("mock call ok...").build();
    }
}
