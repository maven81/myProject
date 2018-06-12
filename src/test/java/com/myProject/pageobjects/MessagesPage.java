package com.myProject.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class MessagesPage {
static WebDriver driver;
	
	@FindBy(id="checkAll")
	WebElement chkboxAll;
	
	@FindBy(id="delete_button")
	WebElement deleteBtn;
	
	@FindBy(xpath="//*[@id='delete_form']/section/div/div/aside/ul/li[1]/a/span")
	WebElement inbox;
	
	@FindBy(xpath="//*[@id=delete_form']/section/div/div/aside/ul/li[2]/a/span")
	WebElement unread;
	
	@FindBy(xpath="//*[@id='delete_form']/section/div/div/aside/ul/li[3]/a/span")
	WebElement sentMail;
	
	@FindBy(xpath="//*[@id='messageforperosnal']/span[2]")
	WebElement newTab;
	
	@FindBy(xpath="//*[@id='delete_form']/section/div/div/div/div/nav/ul/nav/ul/li[1]/a/span")
	WebElement one;
	
	@FindBy(xpath="//*[@id='delete_form']/section/div/div/div/div/nav/ul/nav/ul/li[2]/a/span")
	WebElement two;		
	
	@FindBy(xpath="//*[@id='delete_form']/section/div/div/div/div/nav/ul/nav/ul/li[3]/a/span")
	WebElement next;
	
	@FindBy(xpath="//*[@id='delete_form']/section/div/div/div/div/nav/ul/nav/ul/li[4]/a")
	WebElement last;
	
	@FindBy(id="sort")
	WebElement sortDropdown;
	
	public MessagesPage(WebDriver d)
	{
		driver=d;
		PageFactory.initElements(d, this);
	}
	
	public void clickCheckBoxAll()
	{
		chkboxAll.click();
	}
	
	public void clickDeleteBtn()
	{
		deleteBtn.click();
	}
	
	public void clickInbox()
	{
		inbox.click();
	}

	public void clickUnread()
	{
		unread.click();
	}
	
	public void clickSentMail()
	{
		sentMail.click();
	}
	
	public void clickNew()
	{
		newTab.click();
	}
	
	public void clickOne()
	{
		one.click();
	}
	
	public void clickTwo()
	{
		two.click();
	}
	
	public void clickNext()
	{
		next.click();
	}
	
	public void clickLast()
	{
		last.click();
	}
	public void selectSortBy(String sortby)
	{
		Select sortByDropDown=new Select(sortDropdown);
		sortByDropDown.selectByVisibleText(sortby);
	}

}
