package com.hrm.testscripts;

import org.testng.annotations.Test;

import com.hrm.jar.general;

public class HC001Test {

  @Test
  public void tc001Test() throws Exception {
		general obj = new general();
		obj.openapplication();
		obj.Login();
		obj.sleep();
		obj.logout();
		obj.sleep();
		obj.closeapplication();
  }
}
