package com.hrm.jar;


import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.utility.log;


public class general extends Global {
	public void openapplication() {
		log.info("**********start Execution**********");
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Sandeep\\eclipse-workspace\\test\\fgerggg\\geckodriver.exe" );
        driver = new FirefoxDriver();
        driver.navigate().to(url);
        System.out.println("Login completed");
	}
	public void closeapplication() {
		driver.close();
		System.out.println("Application closed");
	}
	public void Login() {
		driver.navigate().to(url);
		driver.findElement(By.name(txt_name_loginname)).sendKeys(username);
		driver.findElement(By.name(txt_name_password)).sendKeys(password);
		driver.findElement(By.name(loginbutton)).click();
		System.out.println("Login sucessful");
	}
	public void logout() {
		driver.findElement(By.linkText(link_logout)).click();
	}
	public void sleep() throws Exception {
		Thread.sleep(time);
	}
	
	public void add_emplyee(){
		driver.switchTo().frame("rightMenu");
		driver.findElement(By.xpath(click_name_Add_emp_btn)).click();
		driver.findElement(By.name(txt_name_lastname)).sendKeys(Lastname);
		driver.findElement(By.name(txt_name_firstname)).sendKeys(Firstname);
		driver.findElement(By.name(txt_name_middlename)).sendKeys(Middlename);
		driver.findElement(By.id(txt_id_nickname)).sendKeys(Nickname);
		driver.findElement(By.id(click_id_save_emp)).click();
		
		}
	

}
