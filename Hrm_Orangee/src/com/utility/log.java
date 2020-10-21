package com.utility;
import org.apache.log4j.Logger;

public class log {

	private static Logger log=Logger.getLogger(log.class.getName());
	
	
	public static void info(String message) {
		log.info(message);
		
	}
}
