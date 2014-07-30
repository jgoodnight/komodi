package com.jgoodnight.komodi.platform.authentication;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.codahale.metrics.annotation.Timed;

@Path("/authenticate")
@Produces(MediaType.APPLICATION_JSON)
public class AuthenticationResource {
	
	@GET
	@Path("/{id}")
    @Timed
	public Authentication authenticate(@PathParam("id") String id){
		return new Authentication();
	}

}
