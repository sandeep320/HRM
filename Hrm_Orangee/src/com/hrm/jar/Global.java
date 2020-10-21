package com.hrm.jar;

import org.openqa.selenium.WebDriver;

public class Global {
	public WebDriver driver;
	public String url="http://127.0.0.1/orangehrm-2.6/login.php";
	public String username="Admin";
	public String password="Admin";
	public String Lastname="thunu";
	public String Firstname="sandy";
	public String Middlename="rass";
	public String Nickname="sandee";
	public String SSno="256fjr";
	
	
	public String txt_name_loginname="txtUserName";
	public String txt_name_password="txtPassword";
	public String loginbutton="Submit";
	public String link_logout="Logout";
	public long time=3000L;
	public String click_name_Add_emp_btn="/html/body/div/div[2]/form/div[3]/div[1]/input[1]";
	public String txt_name_lastname="txtEmpLastName";
	public String txt_name_firstname="txtEmpFirstName";
	public String txt_name_middlename="txtEmpMiddleName";
	public String txt_id_nickname="txtEmpNickName";
	public String click_id_save_emp="btnEdit";
	public String click_id_editbtn="btnEditPers";
	public String text_name_SSno="txtNICNo";
	public String btn_name_DOB="btnDOB";
	
	
}
