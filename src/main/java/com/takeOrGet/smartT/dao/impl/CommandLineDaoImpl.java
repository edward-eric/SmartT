package com.takeOrGet.smartT.dao.impl;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.takeOrGet.smartT.dao.CommandLineDao;
import com.takeOrGet.smartT.dao.beans.SingleCommand;
import com.takeOrGet.smartT.dao.utils.MultiColumnRowMapper;
import com.takeOrGet.smartT.web.beans.CommandTree;

public class CommandLineDaoImpl extends CommonDAOImpl implements CommandLineDao{

	@Override
	public CommandTree getCommandTree(int id) {
		SingleCommand sc = new SingleCommand();
		List<Map<String, Object>> rows = getTemplate().query(getExecuteSql(), new MultiColumnRowMapper(sc.getCols()));
		
		Iterator<Map<String, Object>> iter = rows.iterator();
		
		while(iter.hasNext()){
			Map<String, Object> row = iter.next();
			Iterator<String> iter2 = sc.getCols().iterator();
			
			while(iter2.hasNext()){
				String col = iter2.next();
			}
			
		}
		return null;
	}
	
	public String getExecuteSql(){
		return "select * from dttmp.commandline";	
	}

}
