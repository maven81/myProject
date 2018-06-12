package com.myProject.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HelpPage {
static WebDriver driver;
	
	@FindBy(xpath="/html/body/div[7]/section[2]/div/div/div[1]/div/ul/li[1]/a/span[2]")
	WebElement getStartedLink;
	
	@FindBy(xpath="/html/body/div[7]/section[2]/div/div/div[1]/div/ul/li[2]/a/span[2]")
	WebElement faqLink;
	
	@FindBy(xpath="/html/body/div[7]/section[2]/div/div/div[1]/div/ul/li[5]/a/span[2]")
	WebElement privacyLink;
	
	@FindBy(xpath="/html/body/div[7]/section[2]/div/div/div[1]/div/ul/li[6]/a/span[2]")
	WebElement policyLink;
	
	@FindBy(xpath="/html/body/div[7]/section[2]/div/div/div[1]/div/ul/li[7]/a/span[2]")
	WebElement securityLink;
	
	@FindBy(xpath="/html/body/div[7]/section[2]/div/div/div[1]/div/ul/li[8]/a/span[2]")
	WebElement liveChatLink;
	
	@FindBy(id="search_question")
	WebElement txtSearch;
	
	@FindBy(xpath="//*[@id='form-search-question']/div/div/button")
	WebElement searchBtn;
	
	@FindBy(xpath="/html/body/div[7]/section[2]/div/div/div[1]/div/ul/li[3]/a/span[2]")
	WebElement eddsLink;
	
	@FindBy(xpath="/html/body/div[7]/section[2]/div/div/div[1]/div/ul/li[4]/a/span[2]")
	WebElement submitRequestLink;
	
	public HelpPage(WebDriver d)
	{
		driver=d;
		PageFactory.initElements(d, this);
	}
	
	public void setSearchText(String val)
	{
		txtSearch.sendKeys(val);
	}
	
	public void clickSearchText()
	{
		searchBtn.click();	
	}
	
	public void clickGetStartedLink()
	{
		getStartedLink.click();
	}
	
	public void clickFAQLink()
	{
		faqLink.click();
	}
	
	public void clickSecurityLink()
	{
		securityLink.click();
	}
	
	public void clickPolicyLink()
	{
		policyLink.click();
	}
	
	public void clickPrivacyLink()
	{
		privacyLink.click();
	}
	
	public void clickLiveChat()
	{
		liveChatLink.click();
	}
	
	public void clickEDDSLink()
	{
		eddsLink.click();
	}
	
	public void clickSubmitARequestLink()
	{
	submitRequestLink.click();
	}

}
