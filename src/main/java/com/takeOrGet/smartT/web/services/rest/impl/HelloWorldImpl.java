package com.takeOrGet.smartT.web.services.rest.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;


import com.google.gson.GsonBuilder;
import com.takeOrGet.smartT.dao.CommandLineDao;
import com.takeOrGet.smartT.web.beans.CommandTree;
import com.takeOrGet.smartT.web.beans.SingleCommand;
import com.takeOrGet.smartT.web.services.HelloWorld;

@Path("/myservices/")
public class HelloWorldImpl implements HelloWorld{
	
	private CommandLineDao commandLineDao;

	public CommandLineDao getCommandLineDao() {
		return commandLineDao;
	}

	public void setCommandLineDao(CommandLineDao commandLineDao) {
		this.commandLineDao = commandLineDao;
	}


	@GET
	@Path("/sayHi")
	@Produces("application/json")
	public Response sayHi(@FormParam("name") String text) {
		Response.ResponseBuilder builder = Response.status(Status.OK);
		
		GsonBuilder gsonBuilder = new GsonBuilder();
		List<SingleCommand> list = new ArrayList<SingleCommand>();
		
		
		SingleCommand c1 = new SingleCommand();
		c1.setId(0);
		c1.setName("command1");
		
		SingleCommand c2 = new SingleCommand();
		c2.setId(1);
		c2.setName("command2");
		
		
	    list.add(c1);
	    list.add(c2);
	    
	    CommandTree tree = new CommandTree();
	    tree.setId(0);
	    tree.setName("tree1");
	    tree.setCommands(list);
	    tree.setDescription("tree example");
		
		builder.entity(gsonBuilder.create().toJson(tree));
		return builder.build();
	}
	
	
	@GET
    @Path("/commandTree/{id}")
    @Produces("application/json")
    public Response getCommandTree(@PathParam("id") String id) {
        Response.ResponseBuilder builder = Response.status(Status.OK);
		
		GsonBuilder gsonBuilder = new GsonBuilder();
		
		
		builder.entity(gsonBuilder.create().toJson(commandLineDao.getCommandTree(1)));
		return builder.build();
    }

	

}
