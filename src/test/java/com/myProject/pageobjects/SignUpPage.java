package com.myProject.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {
	static WebDriver driver;
	
	@FindBy(xpath="//*[@id=\'signUpUser\']")
	WebElement username;
	
	@FindBy(xpath="//*[@id=\'signUpEmail\']")
	WebElement email;
	
	@FindBy(xpath="//*[@id=\'signUpPassword\']")
	WebElement password;
	
	//@FindBy(xpath="/html/body/div[7]/div/form/div[2]/div[5]/button")
	@FindBy(xpath="/html/body/div[7]/div/div/form/div[2]/div[5]/button")
	WebElement signup;

	
	public SignUpPage(WebDriver d)
	{
		driver= d;
		PageFactory.initElements(d, this);
	}
	
	public void setUsername(String uname)
	{
	 
	   username.clear();
	   username.sendKeys(uname);
  	}
	public void setemail(String email)
	{
	 
	   username.clear();
	   username.sendKeys(email);
  	}
	
	
	public void setPassword(String pass)
	{
		password.clear();
		password.sendKeys(pass);
		
	}
	
	public void clicksignup()
	{
		signup.click();
		
		
	}
}

