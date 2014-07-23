package com.takeOrGet.smartT;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.takeOrGet.smartT.dao.CommandLineDao;

public class Test2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		ApplicationContext app = new ClassPathXmlApplicationContext("spring-conf/spring-conf.xml");
		
		CommandLineDao commandLineDao = (CommandLineDao) app.getBean("commandLineDao");
		
		commandLineDao.getCommandTree(1);

	}

}
