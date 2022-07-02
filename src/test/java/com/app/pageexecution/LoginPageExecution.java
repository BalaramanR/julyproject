package com.app.pageexecution;

import com.adactin.base.BaseClass;
import com.app.locators.LoginPageLocators;

public class LoginPageExecution extends LoginPageLocators {
	
	public static void username() {
		BaseClass.typeData(BaseClass.findByID(LoginPageLocators.username), BaseClass.propertiesfile("username"));
	}
	public static void password() {
		BaseClass.typeData(BaseClass.findByID(LoginPageLocators.password), BaseClass.propertiesfile("password"));
	}
	public static void login() {
		BaseClass.click(BaseClass.findByID(LoginPageLocators.login));
	}

}
