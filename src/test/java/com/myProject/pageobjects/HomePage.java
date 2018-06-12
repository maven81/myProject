package com.myProject.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
static WebDriver driver;
	
	@FindBy(xpath="html/body/div[7]/nav/div/form/div[1]/div/button")
	WebElement SearchButton;
	
	@FindBy(xpath=".//*[@id='exampleInputAmount']")
	WebElement SearchText;
	
	@FindBy(xpath="html/body/div[7]/nav/div/form/div[2]/span[1]")
	WebElement CreateNewServicesDropDown;
	
	@FindBy(xpath="html/body/div[7]/nav/div/form/div[2]/ul/li[1]/a")
	WebElement CreateNewServices;
	
	@FindBy(xpath="//a[contains(text(),'Create New Need')]")
	WebElement CreateNewNeed;
	
	@FindBy(xpath="html/body/div[7]/nav/div/div[2]/ul/li[1]/a/span[2]")
	WebElement Plugs;
	
	@FindBy(xpath="html/body/div[7]/nav/div/div[2]/ul/li[2]/a/span[2]")
	WebElement Transactions;
	
	@FindBy(xpath="html/body/div[7]/nav/div/div[2]/ul/li[3]/a/span[1]")
	WebElement MessageIcon ;
	
	@FindBy(xpath="html/body/div[7]/nav/div/div[2]/ul/li[3]/a/span[2]")
	WebElement Messages;
	
//	@FindBy(xpath="html/body/div[7]/nav/div/div[2]/ul/li[4]/a")
//	WebElement UserIcon;
	
	@FindBy(xpath="html/body/div[7]/nav/div/div[2]/ul/li[4]/ul/li[1]/a")
	WebElement Profile;
	
	@FindBy(xpath="html/body/div[7]/nav/div/div[2]/ul/li[4]/ul/li[2]/a")
	WebElement Settings;
	
	@FindBy(xpath="html/body/div[7]/nav/div/div[2]/ul/li[4]/ul/li[3]/a")
	WebElement Signout;
	
	@FindBy(xpath="html/body/div[7]/nav/div/div[2]/ul/li[4]/ul/li[4]/a")
	WebElement Help;
	
	@FindBy(xpath="html/body/div[7]/section/div[1]/div/div[2]/div[1]/span/a")
	WebElement EditProfile;
	
	@FindBy(xpath="html/body/div[7]/div/div[1]/div[1]/div[1]/div[1]/div/a")
	WebElement PendingTransactionsMoreBtn;
	
	@FindBy(xpath="html/body/div[7]/div/div[1]/div[2]/div/div/div/a")
	WebElement NetworkUpdateMoreBtn;
	
	@FindBy(xpath="html/body/div[7]/div/div[1]/div[1]/div[2]/div/div/a")
	WebElement FollowUpdatesMoreBtn;
	
	@FindBy(xpath="html/body/div[7]/div/div[2]/div[1]/div/table/tbody/tr[1]/td/div/a/b")
	WebElement Top5Services1;
	
	@FindBy(xpath="html/body/div[7]/div/div[2]/div[2]/div/table/tbody/tr[1]/td/div/a")
	WebElement Top5Trader1;
	
	public HomePage(WebDriver d)
	{
		driver = d;
		PageFactory.initElements(d, this);
	}
	
	public void setSearchText(String inputText)
	{
		SearchText.sendKeys(inputText);
		SearchButton.click();
	}
	 	
	public void ClickCreateNewServices()
	{
		CreateNewServicesDropDown.click();
		CreateNewServices.click();
	}
	
	public void ClickCreateNewNeed()
	{
		CreateNewServicesDropDown.click();
		CreateNewNeed.click();
	}
	
	public void ClickPlugs()
	{
		Plugs.click();
	}
	
	public void ClickTransactions()
	{
		Transactions.click();
	}
	
	public void ClickMessages()
	{
		Messages.click();
	}
	
	public void ClickUserIcon()
	{
		//WebElement Icon=driver.findElement(By.xpath("html/body/div[7]/nav/div/div[2]/ul/li[4]/a"));
		WebElement userMenu=driver.findElement(By.cssSelector("span.w-icons-hiUser"));
		Actions action = new Actions(driver);
		action.moveToElement(userMenu).build().perform();
	}
	
	public void ClickProfile()
	{
		WebElement userMenu= driver.findElement(By.cssSelector("span.w-icons-hiUser"));
		
		WebElement profile=driver.findElement(By.xpath("/html/body/div[7]/nav/div/div[2]/ul/li[4]/ul/li[1]/a/span[2]"));
		
		 Actions act=new Actions(driver);
		act.moveToElement(userMenu).moveToElement(profile).build().perform();
		//Profile.click();
	}
	
	public void ClickSettings()
	{
		Settings.click();
	}
	public void ClickSignout()
	{
		Signout.click();
	}
	public void ClickHelp()
	{
		Help.click();
	}
	
	public void ClickEditProfile()
	{
		EditProfile.click();
	}
	public void ClickPendingTransactionsMoreBtn()
	{
		PendingTransactionsMoreBtn.click();
	}
	public void ClickNetworkUpdateMoreBtn()
	{
		NetworkUpdateMoreBtn.click();
	}
	public void ClickFollowUpdatesMoreBtn()
	{
		FollowUpdatesMoreBtn.click();
	}
	public void ClickTop5Services1()
	{
		Top5Services1.click();
	}
	public void ClickTop5Trader1()
	{
		Top5Trader1.click();
	}

}
