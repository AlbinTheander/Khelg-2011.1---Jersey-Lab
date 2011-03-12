package com.jayway.jerseylab;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/books")
public class Books {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getAllBooks() {
		return "This is a list of books";
	}
	

	@GET
	@Path("/{bookId}")
	@Produces(MediaType.TEXT_PLAIN)
	public String getBook(@PathParam("bookId") String id) {
		return "Book with id: " + id;
	}
	
	@GET
	@Path("/search")
	@Produces(MediaType.TEXT_PLAIN)
	public String search(@QueryParam("title") String query) {
		return "Book search query: " + query;
	}

}
