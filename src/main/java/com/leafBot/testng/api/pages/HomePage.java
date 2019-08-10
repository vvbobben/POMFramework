package com.leafBot.testng.api.pages;

import org.openqa.selenium.WebElement;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods {
	
	public HomePage() {
		
	}
	
	public LoginPage ClickLogout() {
		WebElement ele = locateElement("class","decorativeSubmit");
		click(ele);
		return new LoginPage();
	}
	public MyHomePage clickToMyHomePage() {
		WebElement ele = locateElement("link","CRM/SFA");
		click(ele);
		return new MyHomePage();
	}
	
}
