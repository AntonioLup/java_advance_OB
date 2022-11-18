package com.rest.restapi.controller;

import com.rest.restapi.models.RestApi;
import com.rest.restapi.service.RestApiService;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.net.URI;
import java.util.List;

@Component
@Path("/")
public class RestController {
    private final RestApiService restapiservice;

    public RestController(RestApiService restapiservice){
        this.restapiservice = restapiservice;

        this.restapiservice.add(new RestApi("antonio"));
        this.restapiservice.add(new RestApi("maria"));
        this.restapiservice.add(new RestApi("ana"));
        this.restapiservice.add(new RestApi("nancy"));
    }

    @GET
    @Path("/api")
    @Produces("application/json")
        public List<RestApi> listarTodos(){
        return restapiservice.getAll();
    }

    @POST
    @Path("/api")
    @Produces("application/json")
    @Consumes("application/json")
    public Response meterApi(RestApi restapi){
        restapiservice.add(restapi);
        return Response.created(
                URI.create("/api/" + restapi.getNombre())
        ).build();
    }

}
