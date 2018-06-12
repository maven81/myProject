package com.myProject.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.myProject.testdata.Constant;
import com.myProject.pageobjects.HomePage;
import com.myProject.pageobjects.SignInPage;

public class TP_015 {
	@Test
	public void TC015() {
		System.setProperty("webdriver.gecko.driver","/usr/local/bin/geckodriver"); 
		  WebDriver driver = new FirefoxDriver();
		  driver.get(Constant.url);
		  driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		  
		  SignInPage login=new SignInPage(driver);
		  login.setUsername("joy");
		  login.setPassword("test2plug");
		  login.clickLogin();
		  HomePage hp = new HomePage(driver);
		  hp.setSearchText("jain");
		  driver.get("https://qatest.twoplugs.com/profile/jain");
		  	
		driver.findElement(By.xpath("/html/body/div[7]/section/div[1]/div/div[2]/div[2]/ul/li[2]/a/span")).click();
		driver.findElement(By.xpath("//*[@id=\'transferAmount\']")).sendKeys("10");
		driver.findElement(By.xpath("/html/body/div[7]/section/div/form/div[3]/ul/li[2]/a/span")).click();
		driver.findElement(By.xpath("/html/body/div[7]/div/div/div/form/div[2]/div/ul/li[2]/a/span")).click();
		
		
		String Expected= (driver.findElement(By.xpath("/html/body/div[7]/div/div"))).getText();
		String actual = ("Credit Transfer was successful");
		
				
	     Assert.assertEquals(actual, Expected);
	     driver.close();
}
}
