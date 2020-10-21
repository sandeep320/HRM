package com.hrm.testscripts;




import org.testng.annotations.Test;

import com.hrm.jar.general;

public class HC001 {

	@Test
	public void tc001() throws Exception {
	

		general obj = new general();
		obj.openapplication();
		obj.Login();
		obj.sleep();
		obj.add_emplyee();
		obj.logout();
		obj.sleep();
		obj.closeapplication();
		
		
	}

}
