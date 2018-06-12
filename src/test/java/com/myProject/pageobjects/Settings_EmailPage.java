package com.myProject.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Settings_EmailPage {
	static WebDriver driver;
	
	@FindBy(name="new_email_verify")
	WebElement txtCurrentEmail;
		
	@FindBy(name="new_email")
	WebElement txtNewEmail;
		
	@FindBy(name="confirm_email")
	WebElement txtConfirmEmail;
		
	@FindBy(name="new_email_password")
	WebElement txtCurrentPassword;
		
	@FindBy(xpath="/html/body/div[7]/div/form/div[2]/ul/li[1]/a/button")
	WebElement cancelBtn;
	
	@FindBy(xpath="/html/body/div[7]/div/form/div[2]/ul/li[2]/button")
	WebElement saveChangesBtn;
	
	public Settings_EmailPage(WebDriver d)
	{
		driver=d;
		PageFactory.initElements(d, this);
	}
	public void setCurrentEmail(String email)
	{
	txtCurrentEmail.sendKeys(email);
	}
	
	public void setNewEmail(String email)
	{
		txtNewEmail.sendKeys(email);
	}
	
	public void setConfirmEmail(String email)
	{
		txtConfirmEmail.sendKeys(email);
	}
	
	public void setCurrentPassword(String pass)
	{
		txtCurrentPassword.sendKeys(pass);
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
