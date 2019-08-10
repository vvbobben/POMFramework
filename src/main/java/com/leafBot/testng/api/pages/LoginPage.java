package com.leafBot.testng.api.pages;

import org.openqa.selenium.WebElement;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods {

	public LoginPage() {
		
	}
	
	public LoginPage enterUsername(String username) {
		WebElement ele = locateElement("id","username");
		clearAndType(ele,username);
		return this;
		
	}
	public LoginPage enterPassword(String password) {
		WebElement ele = locateElement("id","password");
		clearAndType(ele,password);
		return this;
	}
	public HomePage clickLogin() {
		WebElement ele = locateElement("class","decorativeSubmit");
		click(ele);
		return new HomePage();
	}
}
