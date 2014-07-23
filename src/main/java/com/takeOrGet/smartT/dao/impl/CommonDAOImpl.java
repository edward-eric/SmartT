package com.takeOrGet.smartT.dao.impl;

import org.springframework.jdbc.core.JdbcTemplate;

public abstract class CommonDAOImpl {
	
	private JdbcTemplate template;
	
	private String executeSql;

	public String getExecuteSql() {
		return executeSql;
	}

	public void setExecuteSql(String executeSql) {
		this.executeSql = executeSql;
	}

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

}
