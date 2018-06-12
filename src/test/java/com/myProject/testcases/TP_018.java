package com.myProject.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;


import com.myProject.testdata.Constant;
import com.myProject.pageobjects.HomePage;
import com.myProject.pageobjects.NavigationBarPage;
import com.myProject.utilities.SignIn;

public class TP_018 {
	@Test
	public void TC018() {
			
	System.setProperty("webdriver.gecko.driver","./src\\twoPLUGS\\test\\resources\\geckodriver.exe"); 
	  WebDriver driver = new FirefoxDriver();
	  driver.get(Constant.url);
	  SignIn.Execute(driver, Constant.Username, Constant.Password); 
	  driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	   NavigationBarPage search=new NavigationBarPage(driver);
	   WebElement userMenu= driver.findElement(By.cssSelector("span.w-icons-hiUser"));
	   WebElement signout= driver.findElement(By.xpath("/html/body/div[7]/nav/div/div[2]/ul/li[4]/ul/li[3]/a/span[2]"));
			   
	 // HomePage hp = new HomePage(driver);
	  Actions act=new Actions(driver);
		act.moveToElement(userMenu).moveToElement(signout).build().perform();
		search.clickSignOut();
		String actualurl= driver.getCurrentUrl();
		String currenturl=("https://qatest.twoplugs.com/landing");
		Assert.assertEquals(currenturl, actualurl);
		System.out.println(actualurl);
		driver.close();
		
	  
}
}
