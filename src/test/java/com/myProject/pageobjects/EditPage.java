package com.myProject.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditPage {
static WebDriver driver;
	
	@FindBy(xpath="//*[@id='page']/div/div[1]/div[2]/button")
	WebElement changeProfileImgBtn;
	
	@FindBy(name="username")
	WebElement txtUsername;
	
	@FindBy(xpath="/html/body/div[7]/div/form/div[1]/nav/ul/li[1]/a")
	WebElement editTab;
	
	@FindBy(xpath="/html/body/div[7]/div/form/div[1]/nav/ul/li[2]/a")
	WebElement profileTab;
	
	
	@FindBy(xpath="/html/body/div[7]/div/form/div[1]/nav/ul/li[3]/a")
	WebElement bioTab;
	
	@FindBy(xpath="/html/body/div[7]/div/form/div[1]/div[2]/div[2]/a")
	WebElement nextLink;
	
	@FindBy(xpath="/html/body/div[7]/div/form/div[2]/ul[1]/li[1]/a/button")
	WebElement cancelBtn;
			
	@FindBy(xpath="/html/body/div[7]/div/form/div[2]/ul[1]/li[2]/button")
	WebElement saveChangesBtn;
	
	@FindBy(xpath="//*[@id='page']/div/div[1]/div[1]/img")
	WebElement profileImage;
	
	public EditPage(WebDriver d)
	{
		driver=d;
		PageFactory.initElements(d, this);
	}
	
	public void clickChangeProfileImgBtn()
	{
	changeProfileImgBtn.click();
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
	
	public void setUsername(String uname)
	{
		txtUsername.clear();
		txtUsername.sendKeys(uname);
	}
	
	public void clickProfileImg()
	{
		profileImage.click();
	}
	
	public void clickProfileTab()
	{
		profileTab.click();
	}
	
	public void clickBioTab()
	{
		bioTab.click();
	}
	
	public void clickEditTab()
	{
		editTab.click();
	}

}
