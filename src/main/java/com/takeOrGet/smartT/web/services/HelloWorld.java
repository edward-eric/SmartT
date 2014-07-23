package com.takeOrGet.smartT.web.services;

import javax.jws.WebService;
import javax.ws.rs.core.Response;

@WebService
public interface HelloWorld {
	
	public Response sayHi(String text);
	
	public Response getCommandTree(String id);

	
}
