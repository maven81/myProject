package com.myProject.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
	static WebDriver driver;
	
	@FindBy(xpath =".//*[@id='signInEmail']")  
	WebElement username;
	
    @FindBy(xpath=".//*[@id='signInPassword']")
    WebElement password ;
   
    @FindBy(xpath="html/body/div[7]/div/form/div[5]/ul/li[2]/button")
    WebElement login;
    
    @FindBy(xpath="/html/body/div[7]/div/form/div[2]/a")
    WebElement loginWithFacebookLink;
    
    @FindBy(xpath="/html/body/div[7]/div/form/div[5]/ul/li[1]/a")
    WebElement signupBtn;
    
    @FindBy(xpath="/html/body/div[7]/div/form/div[4]/div/a")
    WebElement forgotPasswordLink;
    
    @FindBy(xpath="/html/body/div[7]/nav/div/div[2]/ul/li[1]/a")
    WebElement loginLink;
    
    @FindBy(xpath="/html/body/div[7]/nav/div/div[2]/ul/li[2]/a")
    WebElement helpLink;
    
    
    public SignInPage(WebDriver d) {
		// this.driver=driver;
		driver = d;
		PageFactory.initElements(d, this);
	}

	public void setUsername(String uname)
	{
	 
	   username.clear();
	   username.sendKeys(uname);
  	}
	
	public void setPassword(String pass)
	{
		password.clear();
		password.sendKeys(pass);
		
	}
	
	public void clickLogin()
	{
		login.click();
		
		
	}
	
	public void clickLoginWithFB()
	{
		loginWithFacebookLink.click();
	}
	
	public void clickSignUp()
	{
		signupBtn.click();
	}
	
	public void clickLoginLink()
	{
		loginLink.click();
	}
	
	public void clickHelp()
	{
		helpLink.click();
	}
	
	public void clickForgotPassword()
	{
		forgotPasswordLink.click();
	}
	

}
