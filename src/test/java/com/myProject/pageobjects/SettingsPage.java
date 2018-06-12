package com.myProject.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SettingsPage {
static WebDriver driver;
	
	@FindBy(xpath="/html/body/div[7]/div/form/div[1]/nav/ul/li[4]/a")
	WebElement passwordTab;
	
	@FindBy(xpath="/html/body/div[7]/div/form/div[1]/nav/ul/li[5]/a")
	WebElement emailTab;
	
	@FindBy(xpath="/html/body/div[7]/div/div/div/nav/ul/li[6]/a")
	WebElement hireAFriendTab;
	
	@FindBy(xpath="/html/body/div[7]/div/div/div/nav/ul/li[3]/a")
	WebElement notificationsTab;
	
	@FindBy(xpath="/html/body/div[7]/div/form/div/nav/ul/li[2]/a")
	WebElement serviceMatchtab;
	
	@FindBy(xpath="/html/body/div[7]/div/form/div/nav/ul/li[1]/a/span")
	WebElement verifyIdTab;
			
		
	public SettingsPage(WebDriver d)
	{
		driver=d;
		PageFactory.initElements(d, this);
	}
	
	
	public void clickVerifyIdTab()
	{
		verifyIdTab.click();
	}
	
	public void clickPasswordTab()
	{
		passwordTab.click();
	}
	
	public void clickEmailTab()
	{
		emailTab.click();
	}
	
	public void clickHireAFriendTab()
	{
		hireAFriendTab.click();
	}
	
	public void clickNotificationsTab()
	{
		notificationsTab.click();
	}
	
	public void clickServiceMatch()
	{
		serviceMatchtab.click();
	}

}
