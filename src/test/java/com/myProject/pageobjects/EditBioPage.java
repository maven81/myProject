package com.myProject.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditBioPage {
static WebDriver driver;
	
	@FindBy(xpath="//*[@id='bio']/div[1]/textarea")
	WebElement txtareaDescription;
	
	@FindBy(xpath="//*[@id='delete1']")
	WebElement deleteIcon;
	
	@FindBy(id="img1")
	WebElement imageLink;
	
	@FindBy(id="file2")
	WebElement addhereLink1;
	
	@FindBy(id="file3")
	WebElement addhereLink2;
	
	@FindBy(xpath="/html/body/div[7]/div/form/div[2]/ul[1]/li[1]/a/button")
	WebElement cancelBtn;
	
	@FindBy(xpath="/html/body/div[7]/div/form/div[2]/ul[1]/li[2]/button")
	WebElement saveChangesBtn;
	
	@FindBy(linkText="Next")
	WebElement nextLink;
	
	@FindBy(linkText="Previous")
	WebElement previousLink;
	
	
	public EditBioPage(WebDriver d)
	{
		driver=d;
		PageFactory.initElements(d, this);
	}
	
	public void setDescription(String descrip)
	{
		txtareaDescription.sendKeys(descrip);;
	}
	
	public void clickPrevious()
	{
		previousLink.click();
	}
	
	public void clickNext()
	{
		nextLink.click();
	}
	
	public void clickCancelBtn()
	{
		cancelBtn.click();
	}
	
	public void clickSaveChangesBtn()
	{
		saveChangesBtn.click();
	}
	
	public void clickImage()
	{
		imageLink.click();
	}
	
	public void clickAddHere1()
	{
		addhereLink1.click();
	}
	
	public void clickAddHere2()
	{
		addhereLink2.click();
	}
	
	public void clickDeleteIcon()
	{
		deleteIcon.click();
	}
}
