package eu.europa.ema.demo;

import eu.europa.ema.res.ResponseInfo;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public interface ValidateResource {

    @PUT
    @Path("/assign")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    void assign(@FormParam("taskId") String taskId);

    @PUT
    @Path("/{taskId}/complete")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    void complete(@PathParam("taskId") String taskId, @FormParam("validateTaskData") String validateTaskData);

    @PUT
    @Path("/{userId}/activate")
    void activate(@PathParam("userId") String userId);

    @PUT
    @Path("/{userId}/inactivate")
    ResponseInfo<String> inactivate(@PathParam("userId") String userId);

    @DELETE
    @Path("/{considerationId}")
    ResponseInfo<String> remove(@PathParam("considerationId") Long considerationId);

    @POST
    @Path("/share")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    ResponseInfo<String> share(@FormParam("considerationIds") List<Long> considerationIds);

    @GET
    @Path("/{ctNumber}/findByCTNumber")
    String findByCTNumber(@PathParam("ctNumber") String ctNumber);
}
