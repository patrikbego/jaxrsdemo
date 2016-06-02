package eu.europa.ema.demo;

import eu.europa.ema.res.ResponseInfo;

import javax.ws.rs.*;
import java.util.List;

/**
 * @author SARMPANE
 */
public interface AuthoriseResource {

    @PUT
    @Path("/assign")
    void assign(@FormParam("taskId") String taskId);

    @PUT
    @Path("/{userId}/activate")
    void activate(@PathParam("userId") String userId);

    @PUT
    @Path("/{userId}/inactivate")
    ResponseInfo<String> inactivate(@PathParam("userId") String userId);

    @PUT
    @Path("/{taskId}/complete")
    void complete(@PathParam("taskId") String taskId, @FormParam("validateTaskData") String validateTaskData);

    @PUT
    @Path("/save")
    void save(@FormParam("validateTaskData") String validateTaskData);

    @DELETE
    @Path("/{considerationId}")
    ResponseInfo<String> remove(@PathParam("considerationId") Long considerationId);

    @POST
    @Path("/share")
    ResponseInfo<String> share(@FormParam("considerationIds") List<Long> considerationIds);

    @GET
    @Path("/{ctNumber}/findByCTNumber")
    String findByCTNumber(@PathParam("ctNumber") String ctNumber);

}
