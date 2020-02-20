package com.crm.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.loginPage;
import com.crm.qa.pages.homePage;

public class loginPageTest extends TestBase{
	loginPage loginPage;
	homePage homePage;
	public loginPageTest() {
		super();
	}
	@BeforeMethod
	public void setup() {
		initialisation();
		loginPage=new loginPage();
		
	}
	@Test
	public void validateLoginTest() {
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
