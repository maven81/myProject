package com.myProject.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Settings_ServiceMatchPage {
static WebDriver driver;
	
	//@FindBy(id="match_type")
@FindBy(xpath="//*[@id=\'match_type\']")
	WebElement matchtypeDropDown;
	
	@FindBy(id="category_id")
	WebElement categoryDropDown;
	
	@FindBy(id="subcategory_id")
	WebElement subcategoryDropDown;
	
	@FindBy(xpath="//*[@id='set-tab-4']/div/div[4]/button")
	WebElement addBtn;
	
	public Settings_ServiceMatchPage(WebDriver d)
	{
		driver=d;
		PageFactory.initElements(d, this);
	}
	
	public void selectTypeOfMatch(String match)
	{
		Select matchTypeDrop=new Select(matchtypeDropDown);
		matchTypeDrop.selectByVisibleText(match);
	}
	
	public void selectCategory(String category)
	{
		Select categoryDrop = new Select(categoryDropDown);
		categoryDrop.selectByVisibleText(category);
	}
	
	public void selectSubCategory(String subCategory)
	{
		Select subCategoryDrop = new Select(subcategoryDropDown);
		subCategoryDrop.selectByVisibleText(subCategory);
	}
	
	public void clickAdd()
	{
		addBtn.click();
	}

}
