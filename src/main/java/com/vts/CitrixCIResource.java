package com.vts;

import java.util.List;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;

@Path("citrix-cis")
@ApplicationScoped
@Produces("application/json")
@Consumes("application/json")
public class CitrixCIResource {

    @GET
    public List<CitrixCI> getAll() {
        return CitrixCI.listAll();
    }
    
    @GET
    @Path("{name}")
    public CitrixCI getSingle(String name) {
    	return CitrixCI.find("CI_NAME", name).firstResult();
    }
    
    @GET
    @Path("count")
    public Long count() {
    	return CitrixCI.count();
    }
}
