package com.myProject.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NavigationBarPage {
	static WebDriver driver;
	
	@FindBy(xpath="/html/body/div[7]/nav/div/div[1]/a")
	WebElement logoLink;
	
	@FindBy(xpath="//*[@id='exampleInputAmount']")
	WebElement txtSearch;
	
	@FindBy(xpath="/html/body/div[7]/nav/div/form/div[2]/span[1]")
	
	WebElement createNewServiceBtn;
	
	@FindBy(xpath="/html/body/div[7]/nav/div/form/div[2]/ul/li[1]/a")
	WebElement createNewService;
	
	@FindBy(xpath="/html/body/div[7]/nav/div/form/div[2]/ul/li[2]/a")
	WebElement createNewNeed;
	
	@FindBy(xpath="/html/body/div[7]/nav/div/div[2]/ul/li[1]/a/span[2]")
	WebElement plugsLink;
	
	@FindBy(xpath="/html/body/div[7]/nav/div/div[2]/ul/li[2]/a/span[2]")
	WebElement transactionsLink;
	
	@FindBy(xpath="/html/body/div[7]/nav/div/div[2]/ul/li[3]/a/span[2]")
	WebElement messagesLink;
	
	@FindBy(css="span.w-icons-hiUser")
	WebElement userMenu;
	
	
	
	@FindBy(xpath="/html/body/div[7]/nav/div/div[2]/ul/li[4]/ul/li[1]/a/span[2]")
	WebElement profile;
	
	@FindBy(xpath="/html/body/div[7]/nav/div/div[2]/ul/li[4]/ul/li[2]/a/span[2]")
	WebElement settings;
	
	@FindBy(xpath="/html/body/div[7]/nav/div/div[2]/ul/li[4]/ul/li[3]/a/span[2]")
	WebElement signout;
	
	@FindBy(xpath="/html/body/div[7]/nav/div/div[2]/ul/li[4]/ul/li[4]/a/span[2]")
	WebElement help;
	
	public NavigationBarPage(WebDriver d)
	{
		driver=d;
		PageFactory.initElements(d, this);
	}
	
	public void clickUserMenu()
	{
		
	//WebElement userMenu=driver.findElement(By.cssSelector("span.w-icons-hiUser"));
		//userMenu.click();
		Actions act=new Actions(driver);
		act.moveToElement(userMenu).build().perform();
		
	}
	
	public void clickHelp()
	{
		help.click();
	}
	public void clickSignOut()
	{
		signout.click();
	}
	public void clickProfile()
	{
		//Actions pr=new Actions(driver);
		//pr.moveToElement(profile).build().perform();
		profile.click();
	}
	public void clickSettings()
	
	{
		Actions act=new Actions(driver);
		act.moveToElement(userMenu).moveToElement(settings).build().perform();
		settings.click();
	}
	
	public void clickMessagesLink()
	{
		messagesLink.click();
	}
	public void clickTransactionsLink()
	{
		transactionsLink.click();
	}
	
	public void clickPlugsLink()
	{
		plugsLink.click();
	}
	public void clickCreateNewNeed()
	{
		createNewNeed.click();
	}
	
	public void clickCreateNewService()
	{
		createNewService.click();
	}
	
	public void clickCreateNewServiceDropDown()
	{
		createNewServiceBtn.click();
		
	}
	
	public void setSearchKey(String key)
	{
		txtSearch.sendKeys(key);
	}
	
	public void clickLogoLink()
	{
		logoLink.click();
	}

	

}
