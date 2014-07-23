package com.takeOrGet.smartT.dao.utils;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.RowMapper;

public class MultiColumnRowMapper implements RowMapper<Map<String, Object>> {
	
	private List<String> colNames;

	public List<String> getColNames() {
		return colNames;
	}
	
	public void addColName(String colName){
		this.colNames.add(colName);
	}

	public MultiColumnRowMapper(List<String> colNames) {
		this.colNames = colNames;
	}

	@Override
	public Map<String, Object> mapRow(ResultSet rs, int rowNum) throws SQLException {
		Map<String, Object> columns = new HashMap<String, Object>();
		for(String col : colNames){
			columns.put(col, rs.getObject(col));
		}
		return columns;
	}
}
