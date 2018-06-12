package com.myProject.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Settings_NotificationsPage {
static WebDriver driver;
	
	@FindBy(id="check1-styler")
	WebElement ckhboxPurchases;
	
	@FindBy(id="check2-styler")
	WebElement ckhboxBids;
	
	@FindBy(id="check3-styler")
	WebElement chkboxRefund;
	
	@FindBy(id="check4-styler")
	WebElement chkboxComplaint;
	
	@FindBy(id="check5-styler")
	WebElement chkboxMessages;
	
	@FindBy(id="check6-styler")
	WebElement chkboxWhosFollowingMe;
	
	@FindBy(xpath="/html/body/div[7]/div/form/div[2]/ul/li[1]/a/button")
	WebElement cancelBtn;
	
	@FindBy(xpath="/html/body/div[7]/div/form/div[2]/ul/li[2]/button")
	WebElement saveChangesBtn;
	
	
	public Settings_NotificationsPage(WebDriver d)
	{
		driver=d;
		PageFactory.initElements(d, this);
	}
	
	public void clickChkboxPurchases()
	{
		ckhboxPurchases.click();
	}
	
	public void clickChkboxBids()
	{
		ckhboxBids.click();
	}
	
	public void clickChkboxRefunds()
	{
		chkboxRefund.click();
	}
	
	public void clickChkboxComplaint()
	{
		chkboxComplaint.click();
	}
	
	public void clickChkboxMessages()
	{
		chkboxMessages.click();
	}
	
	public void clickChkboxWhosFollMe()
	{
		chkboxWhosFollowingMe.click();
	}
	
	public void clickCancelBtn()
	{
		cancelBtn.click();
	}
	
	public void clickSaveChangesBtn()
	{
		saveChangesBtn.click();
	}

}
