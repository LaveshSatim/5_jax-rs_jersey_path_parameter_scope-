package com.lavesh.api;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("{address}/path")
public class PathParam {

	@GET
	@Path("/get1")
	@Produces(MediaType.TEXT_PLAIN)
	public String get1(@jakarta.ws.rs.PathParam("address") String address) {

		return address;
	}

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/get2")
	public String get2(@jakarta.ws.rs.PathParam("address") String address) {

		return address + " : nice city";
	}

}
