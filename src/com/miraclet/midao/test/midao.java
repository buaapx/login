package com.miraclet.midao.test;

import java.util.HashMap;
import java.util.Map;

import org.midao.jdbc.core.MidaoFactory;
import org.midao.jdbc.core.handlers.input.named.MapInputHandler;
import org.midao.jdbc.core.handlers.output.MapOutputHandler;
import org.midao.jdbc.core.service.QueryRunnerService;

import javax.sql.DataSource;

public class midao {
	public static void main(String[] args){
		DataSource dataSource = new DataSource();
		
		QueryRunnerService runner = MidaoFactory.getQueryRunner(dataSource);
		 
		Map<String, Object> queryParameters = new HashMap<String, Object>();
		queryParameters.put("id", 1);
		 
		MapInputHandler input = new MapInputHandler("SELECT name FROM students WHERE id = :id", queryParameters);
		 
		Map<String, Object> result = runner.query(input, new MapOutputHandler());
	}
}
