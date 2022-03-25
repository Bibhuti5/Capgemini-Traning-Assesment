package com.cg.config;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	@Value("${my.greeting: Site is under construction}")
	private String greetingMessage;
	
	@Value("${my.list.values}")
	private List<String> listValues;
	
//	@Value("#{${db.connection}}")
//	private Map<String,String> dbValues;
	
	@Autowired
	private DbSetting dbSetting;
	
	@Autowired
	private Environment env;
	
	@GetMapping("/greeting")
	public String greeting(){
		return dbSetting.getConnection()+ dbSetting.getHost() + dbSetting.getPort();
	}
	
	@GetMapping("/envdetails")
	public String envDetails() {
		return env.toString();
	}
}
