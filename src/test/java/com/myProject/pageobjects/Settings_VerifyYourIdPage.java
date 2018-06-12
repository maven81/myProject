package com.myProject.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Settings_VerifyYourIdPage {
static WebDriver driver;

	@FindBy(id="idimage")
	WebElement chooseFileBtn;
	
	@FindBy(xpath="//*[@id='set-tab-5']/div/div[5]/button")
	WebElement saveAndContinueBtn;
	
	public Settings_VerifyYourIdPage(WebDriver d)
	{
		driver=d;
		PageFactory.initElements(d, this);
	}
	
	public void clickChooseFileBtn()
	{
		chooseFileBtn.click();
	}
	
	public void clickSaveAndContinueBtn()
	{
		saveAndContinueBtn.click();
	}
}
