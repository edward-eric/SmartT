package com.takeOrGet.smartT.web.beans;

import java.util.ArrayList;
import java.util.List;

public class CommandTree {
	
	private int id;
	private String name;
	private String description;
	private List<SingleCommand> commands = new ArrayList<SingleCommand>();
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<SingleCommand> getCommands() {
		return commands;
	}
	public void setCommands(List<SingleCommand> commands) {
		this.commands = commands;
	}
}
