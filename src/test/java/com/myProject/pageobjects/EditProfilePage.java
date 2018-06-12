package com.myProject.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class EditProfilePage {
static WebDriver driver;
	
	@FindBy(name="firstname")
	WebElement txtFirstName;
	
	@FindBy(name="lastname")
	WebElement txtLastName;
	
	@FindBy(xpath="//*[@id='profile']/div/div[3]/div/ul/li[1]/label/span")
	WebElement radioBtnMale;
	
	@FindBy(xpath="//*[@id='profile']/div/div[3]/div/ul/li[2]/label/span[1]")
	WebElement radioBtnFemale;
	
	@FindBy(xpath="//*[@id='profile']/div/div[3]/div/ul/li[3]/label/span[1]")
	WebElement radioBtnUndefined;
	
	@FindBy(name="addr1")
	WebElement txtAddress1;
	
	@FindBy(name="addr2")
	WebElement txtAddress2;
	
	@FindBy(id="checkbox1-styler")
	WebElement chkboxAddDisplayed;
	
	@FindBy(name="postalcode")
	WebElement txtPostalCode;
	
	@FindBy(xpath="//*[@id='countryDropdown']")
	//WebElement dropdownCountry;
	//@FindBy(xpath="/html/body/div[7]/div/form/div[1]/div[1]/div[2]/div/div[7]/div/div/div[1]/div[2]")
	WebElement dropdownCountry;
	///html/body/div[7]/div/form/div[1]/div[1]/div[2]/div/div[7]/div/div/div[1]/div[2]
	
	
	@FindBy(xpath="//*[@id='stateDropdown']")
	//@FindBy(name="state_id")
	WebElement dropdownProvince;
	
	@FindBy(xpath="//*[@id=\'cityDropdown\']")
	//@FindBy(name="city")
	WebElement dropdownCity;
	
	@FindBy(linkText="Next")
	WebElement nextLink;
	
	@FindBy(linkText="Previous")
	WebElement previousLink;
	
	@FindBy(xpath="/html/body/div[7]/div/form/div[2]/ul[1]/li[1]/a/button")
	WebElement cancelBtn;
	
	@FindBy(xpath="/html/body/div[7]/div/form/div[2]/ul[1]/li[2]/button")
	WebElement saveChangesBtn;
	
	
	public EditProfilePage(WebDriver d)
	{
		driver=d;
		PageFactory.initElements(d, this);
	}

	public void setFirstName(String fname)
	{
		txtFirstName.clear();
		txtFirstName.sendKeys(fname);
	}
	public void setLastName(String lname)
	{
		txtLastName.clear();
		txtLastName.sendKeys(lname);;
	}
	
	public void clickRadioMale()
	{
		
		radioBtnMale.click();
	}
	
	public void clickRadioFemale()
	{
		
		radioBtnFemale.click();
	}
	
	public void clickRadioUndefined()
	{
		radioBtnUndefined.click();
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
	
	public void clickchekboxAddDisplayed()
	{
	chkboxAddDisplayed.click();
	}
	
	public void setAdd1(String add1)
	{
		txtAddress1.clear();
		txtAddress1.sendKeys(add1);
	}
	
	public void setAdd2(String add2)
	{
		txtAddress2.clear();
		txtAddress2.sendKeys(add2);
	}
	
	public void setPostalCode(String postalcode)
	{
		txtPostalCode.clear();
		txtPostalCode.sendKeys(postalcode);
	}
	
	public void selectCountry(String country) 
	{
		Select drop = new Select(dropdownCountry);
		drop.selectByVisibleText(country);
	}	
	
	public void selectProvince(String province) 
	{
		Select drop = new Select(dropdownProvince);
		drop.selectByVisibleText(province);
	}
	
	public void selectCity(String city) 
	{
		Select drop = new Select(dropdownCity);
		drop.selectByVisibleText(city);
	}

}
