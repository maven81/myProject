package com.myProject.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Settings_ReferAFriendPage {
static WebDriver driver;
	
	@FindBy(id="email_input")
	WebElement txtEmailAddresses;
	
	@FindBy(xpath="//*[@id='set-tab-6']/div[2]/div[3]/a")
	WebElement facebookBtn;
	
	@FindBy(xpath="//*[@id='set-tab-6']/div[2]/div[1]/form/button")
	WebElement sendBtn;
	
	public Settings_ReferAFriendPage(WebDriver d)
	{
		driver=d;
		PageFactory.initElements(d, this);
	}
	
	public void setEmailAdresses(String emailadd)
	{
	txtEmailAddresses.sendKeys(emailadd);
	}
	
	public void clickFacebookBtn()
	{
	facebookBtn.click();
	}
	
	public void clickSendBtn()
	{
	sendBtn.click();
	}
}
