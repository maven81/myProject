package com.myProject.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.myProject.testdata.Constant;
import com.myProject.pageobjects.EditProfilePage;
import com.myProject.pageobjects.NavigationBarPage;
import com.myProject.utilities.SignIn;

public class TP_010 {
	@Test 
	public void TC010() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./src\\twoPLUGS\\test\\resources\\geckodriver.exe");
		   WebDriver driver=new FirefoxDriver();
		   driver.get(Constant.url);
		   SignIn.Execute(driver, Constant.Username, Constant.Password);
		   driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		   NavigationBarPage search=new NavigationBarPage(driver);
		   WebElement userMenu= driver.findElement(By.cssSelector("span.w-icons-hiUser"));
			
			
			
			
		   WebElement profile=driver.findElement(By.xpath("/html/body/div[7]/nav/div/div[2]/ul/li[4]/ul/li[1]/a/span[2]"));
			
		   Actions act=new Actions(driver);
			act.moveToElement(userMenu).moveToElement(profile).build().perform();
		   search.clickUserMenu();
		   search.clickProfile();
		   
		   driver.findElement(By.xpath("/html/body/div[7]/div[4]/div[1]/div[1]/div/div[1]/div/a[2]")).click();
		   EditProfilePage ep = new EditProfilePage(driver);
		   Thread.sleep(2000);
		   ep.setFirstName("Joy");
		   ep.setLastName("joy1");
		   ep.clickRadioMale();
		   ep.setAdd1("1234 abcd st");
		   ep.setAdd2("1234 abcd st");
		   ep.setPostalCode("l4y7d");
		   JavascriptExecutor js1=(JavascriptExecutor) driver;
		   js1.executeScript("window.scrollBy(0,200)","");
		   driver.findElement(By.xpath("/html/body/div[7]/div/form/div[1]/div[1]/div[2]/div/div[7]/div/div/div[1]/div[2]")).click();
		   driver.findElement(By.xpath("/html/body/div[7]/div/form/div[1]/div[1]/div[2]/div/div[7]/div/div/div[2]/ul/li[3]")).click();
		   driver.findElement(By.xpath("/html/body/div[7]/div/form/div[1]/div[1]/div[2]/div/div[8]/div/div/div[1]/div[2]/div")).click();
		   driver.findElement(By.xpath("/html/body/div[7]/div/form/div[1]/div[1]/div[2]/div/div[8]/div/div/div[2]/ul/li[5]")).click();
		   driver.findElement(By.xpath("/html/body/div[7]/div/form/div[1]/div[1]/div[2]/div/div[9]/div/div/div[1]/div[2]/div")).click();
		   driver.findElement(By.xpath("/html/body/div[7]/div/form/div[1]/div[1]/div[2]/div/div[9]/div/div/div[2]/ul/li[3]")).click();
		   driver.findElement(By.xpath("/html/body/div[7]/div/form/div[1]/div[2]/div[1]/a")).click();
		   System.out.println(driver.getCurrentUrl());
		   driver.findElement(By.xpath("/html/body/div[7]/div/form/div[2]/ul[1]/li[2]/button")).click();
		
		   String updatemessage=driver.findElement(By.xpath("/html/body/div[7]/div/div")).getText();
		   String actualmessage= ("Your profile has been updated");
		   Assert.assertEquals(actualmessage,updatemessage);
		   driver.close();
	}

}
