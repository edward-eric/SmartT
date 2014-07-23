package com.takeOrGet.smartT.web.services.impl;

import javax.jws.WebService;
import javax.ws.rs.core.Response;

import com.takeOrGet.smartT.web.services.HelloWorld;

@WebService(endpointInterface="com.takeOrGet.smartT.web.services.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

	@Override
	public Response sayHi(String text) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response getCommandTree(String id) {
		// TODO Auto-generated method stub
		return null;
	}



}
