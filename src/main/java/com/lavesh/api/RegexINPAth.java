package com.lavesh.api;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/type")
public class RegexINPAth {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
//	@Path("/{email}/verify")
	@Path("/{email: ^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\\\.[A-Z]{2,6}$}/verify")
	public String verifyEmail(@PathParam("email") String email) {
//just for testing purpose
		return "verifyed email : " + email;
	}
}
