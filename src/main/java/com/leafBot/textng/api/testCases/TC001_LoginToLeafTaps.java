package com.leafBot.textng.api.testCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class TC001_LoginToLeafTaps extends ProjectSpecificMethods{
	@BeforeTest
	public void SetData() {
		excelFileName = "TC002";
		testcaseName = "TC001_LoginToLeafTaps";
	}
	
	
	
	@Test(dataProvider = "fetchData")
	public void runLogin(String uname, String password) {
		new com.leafBot.testng.api.pages.LoginPage()
		.enterUsername(uname)
		.enterPassword(password)
		.clickLogin();
	
	}
}
