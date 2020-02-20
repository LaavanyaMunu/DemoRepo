package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class loginPage extends TestBase {

	//PageFactory or object Repository
	@FindBy(name="email")
	WebElement emailaddress;
	@FindBy(name="password")
	WebElement password;
	@FindBy(xpath="//div[text()='Login']")
	WebElement loginbtn;
	@FindBy(xpath="//a[text()='Sign Up']")
	WebElement signupbtn;
	
	public loginPage() {
		PageFactory.initElements(driver, this);
	}
	public homePage login(String un, String pw)
	{
		emailaddress.sendKeys(un);
		password.sendKeys(pw);
		loginbtn.click();
		return new homePage();
	}
	
}
