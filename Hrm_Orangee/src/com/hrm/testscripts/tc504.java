package com.hrm.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrm.jar.general;

public class tc504 {
	
	@Test
	public void login() {
		DOMConfigurator.configure("log4j.xml");
		general g=new general();
		g.openapplication();
		g.Login();
		g.logout();
		g.closeapplication();
	}

}
