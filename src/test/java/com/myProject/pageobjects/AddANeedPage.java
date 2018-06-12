package com.myProject.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddANeedPage {

	static WebDriver driver;
	
	@FindBy(xpath=".//*[@id='name']")
	WebElement Title;
	
	@FindBy(xpath=".//*[@id='description']")
	WebElement Description;
	
	@FindBy(id= "category_id")
	WebElement Category;
	///html/body/div[7]/div[1]/form/div[2]/div[1]/div/div/div[1]/div[1]
	////*[@id="category_id-styler"]/div[1]/div[1]
	////*[@id="category_id"]
	//*[@id="category_id"]
	@FindBy(xpath="//select[@id='subcategory_id']")
	WebElement SubCategory;
	
	@FindBy(xpath=".//*[@id='price']")
	WebElement Price;
	
	//@FindBy(xpath="")
	//WebElement RefundSlider;
	
	@FindBy(xpath=".//*[@id='refund_valid']")
	WebElement RefundValid;
	
	@FindBy(xpath=".//*[@id='file1']")
	WebElement AddImage1;
	
	@FindBy(xpath=".//*[@id='file2']")
	WebElement AddImage2;
	
	@FindBy(xpath=".//*[@id='file3']")
	WebElement AddImage3;
	
	@FindBy(xpath=".//*[@id='videourl']")
	WebElement VideoURL;
	
	@FindBy(xpath=".//*[@id='imagegroup']/div[4]/div/ul/li[1]/span/label/div")
	WebElement ActiveChkBox;
	
	@FindBy(xpath=".//*[@id='imagegroup']/div[4]/div/ul/li[2]/span/label/div")
	WebElement NoBiddingChkBox;
	
	@FindBy(xpath=".//*[@id='imagegroup']/div[5]/ul/li[1]/button")
	WebElement CancelButton;
	
	@FindBy(xpath=".//*[@id='imagegroup']/div[5]/ul/li[2]/button")
	WebElement CreateButton;
	
		
	
	public AddANeedPage(WebDriver d)
	{
		driver = d;
		PageFactory.initElements(d, this);
	}
	
	
	public void SetTitle(String title)
	{
		Title.clear();
		Title.sendKeys(title);
	}
	public void SetDescription(String description)
	{
		Description.clear();
		Description.sendKeys(description);
	}
	public void SelectCategory(String choosecategory)
	{
		Select dropDown= new Select(Category);
		dropDown.selectByVisibleText(choosecategory);
	}
	public void SelectSubCategory(String choosesubCategory)
	{
		Select dropDown= new Select(SubCategory);
		dropDown.selectByVisibleText(choosesubCategory);
	}
	public void SetPrice(String price)
	{
		Price.sendKeys(price);
	}
	public void MoveRefundSlider(int refundPercent)
	{
		WebElement RefundSlider=driver.findElement(By.cssSelector("div[id='slider-range-max3'][class='ui-slider ui-slider-horizontal ui-widget ui-widget-content ui-corner-all']"));
		Actions move=new Actions(driver);
		move.dragAndDropBy(RefundSlider, refundPercent, 0).perform();
	}
	public void SetRefundValid(String NoOfDay)
	{
		RefundValid.sendKeys(NoOfDay);
	}
	public void clickAddImage1()
	{
		AddImage1.click();
	}
	public void clickAddImage2()
	{
		AddImage2.click();
	}
	public void clickAddImage3()
	{
		AddImage3.click();
	}
	public void setVideoURL(String videoUrl)
	{
		VideoURL.sendKeys(videoUrl);
	}
	public void ClickActiveChkBox()
	{
		ActiveChkBox.click();
	}
	public void ClickNoBiddingChkBox()
	{
		NoBiddingChkBox.click();
	}
	public void ClickCancelButton()
	{
		CancelButton.click();
	}
	public void ClickCreateButton()
	{
		CreateButton.click();
	}

}
