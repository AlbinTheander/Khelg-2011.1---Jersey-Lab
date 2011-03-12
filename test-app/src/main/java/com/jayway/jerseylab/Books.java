package com.jayway.jerseylab;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/books")
public class Books {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String allBooks() {
		return "This is a list of books";
	}

}
