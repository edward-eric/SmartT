package com.takeOrGet.smartT.dao.beans;

import java.util.ArrayList;
import java.util.List;

public class SingleCommand {
	
	private List<String> cols = new ArrayList<String>();
	
	public SingleCommand(){
		cols.add("commandid");
		cols.add("name");
		cols.add("description");
		cols.add("linestring");
		cols.add("type");
	}

	public List<String> getCols() {
		return cols;
	}

	public void setCols(List<String> cols) {
		this.cols = cols;
	}
	
	public void addCol(String col){
		this.cols.add(col);
	}
	
	

}
