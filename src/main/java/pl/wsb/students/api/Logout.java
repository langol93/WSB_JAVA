package pl.wsb.students.api;

import pl.wsb.students.consts.ApiEndpoints;


import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path(ApiEndpoints.LOGOUT)
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class Logout {
    @POST
    public Response postLogout(Logout body)
    {
        return Response.status(Response.Status.OK).entity("Bye Bye").build();
    }
}
