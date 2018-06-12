package com.myProject.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Settings_PasswordPage {
static WebDriver driver;
	
	@FindBy(name="new_password_verify")
	WebElement txtSignUpPassword;
	
	@FindBy(name="new_password")
	WebElement txtNewPassword;
	
	@FindBy(name="confirm_password")
	WebElement txtConfirmPassword;
	
	@FindBy(xpath="/html/body/div[7]/div/form/div[2]/ul/li[1]/a/button")
	WebElement cancelBtn;
	
	@FindBy(xpath="/html/body/div[7]/div/form/div[2]/ul/li[2]/button")
	WebElement saveChangesBtn;
	
	public Settings_PasswordPage(WebDriver d)
	{
		driver=d;
		PageFactory.initElements(d, this);
	}
	
	public void setCurrentPassword(String pass)
	{
		txtSignUpPassword.sendKeys(pass);
	}

	public void setNewPassword(String pass)
	{
		txtNewPassword.sendKeys(pass);
	}
	
	public void setConfirmPassword(String pass)
	{
		txtConfirmPassword.sendKeys(pass);
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
