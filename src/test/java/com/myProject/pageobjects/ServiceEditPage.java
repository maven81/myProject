package com.myProject.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ServiceEditPage {
static WebDriver driver;
	
	@FindBy(xpath="html/body/div[8]/section/div/div[2]/div[1]/div/div/div/a")
	WebElement EditServices;
	
	
	@FindBy(xpath=".//*[@id='emailShare']")
	WebElement EmailIcon;
	
	@FindBy(xpath="html/body/div[8]/section/div/div[2]/div[2]/div[1]/div/div/div/ul/li[2]/a")
	WebElement TwitterIcon;
	
	@FindBy(xpath="html/body/div[8]/section/div/div[2]/div[2]/div[1]/div/div/div/ul/li[3]/a")
	WebElement FacebookIcon;
	
	
	
	public ServiceEditPage(WebDriver d)
	{
		driver = d;
		PageFactory.initElements(d, this);
	}
	
	public void clickEditServices()
	{
		EditServices.click();
	}
	
	public void moveOnSharedIcon()
	{
		WebElement SharedIcon = driver.findElement(By.cssSelector("span[class='w-icons-fork green']"));
		Actions action=new Actions(driver);
		action.moveToElement(SharedIcon).build().perform();
	}
	public void clickEmailIcon()
	{
		EmailIcon.click();
	}
	public void clickTwitterIcon()
	{
		TwitterIcon.click();
	}
	public void clickFacebookIcon()
	{
		FacebookIcon.click();
	}

}
