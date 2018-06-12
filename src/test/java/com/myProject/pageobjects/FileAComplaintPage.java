package com.myProject.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FileAComplaintPage {
static WebDriver driver;
	
	@FindBy(id="reportSubject")
	WebElement txtSubject;
	
	@FindBy(name="content")
	WebElement txtContent;
	
	@FindBy(xpath="//*[@id='compliantform']/div[5]/ul/li[1]/a")
	WebElement cancelBtn;
	
	@FindBy(xpath="//*[@id='compliantform']/div[5]/ul/li[2]/button")
	WebElement submitComplaintBtn;
			
	
	public FileAComplaintPage(WebDriver d)
	{
		driver=d;
		PageFactory.initElements(d, this);
	}
	
	public void setSubject(String val)
	{
		txtSubject.sendKeys(val);
	}
	
	public void setContent(String text)
	{
		txtContent.sendKeys(text);
	}
	
	public void clickCancelBtn()
	{
		cancelBtn.click();
	}
	
	public void clickSubmitComplaintBtn()
	{
		submitComplaintBtn.click();
	}

}
