package org.aravind.messanger.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.aravind.messanger.service.MessageService;
import com.google.gson.Gson;
import org.aravind.messanger.model.Message;

@Path("/messages")
public class MessageResource {
	MessageService messageObjects = new MessageService();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getMEssages() {
		Gson gson = new Gson();
		List<Message> msgs = messageObjects.getAllMessages();
		String jsonString = gson.toJson(msgs);
		return Response.status(Response.Status.OK).entity(jsonString).build();
	}
	
	@GET
	@Path("/test")
	@Produces(MediaType.TEXT_PLAIN)
	public String testCall() {
		return "test";
	}
	
	@GET
	@Path("/{messageID}")
	@Produces(MediaType.TEXT_PLAIN)
	public Response getMessage(@PathParam("messageID") long messageID) {
		Gson gson = new Gson();
		Message msg = messageObjects.getMessage(messageID);
		String jsonString = gson.toJson(msg);
		return Response.status(Response.Status.OK).entity(jsonString).build();
	}
}
