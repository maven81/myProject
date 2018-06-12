package com.myProject.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.myProject.testdata.Constant;
import com.myProject.pageobjects.HomePage;
import com.myProject.pageobjects.MessagesPage;
import com.myProject.utilities.SignIn;

public class TP_013 {
	@Test 
	public void TC013()
		{
		System.setProperty("webdriver.gecko.driver","/usr/local/bin/geckodriver"); 
		  WebDriver driver = new FirefoxDriver();
		  driver.get(Constant.url);
		  SignIn.Execute(driver, Constant.Username, Constant.Password); 
		  HomePage hp = new HomePage(driver);
		  hp.setSearchText("ride");
		  driver.findElement(By.xpath("/html/body/div[7]/div/div[2]/div/table/tbody/tr[1]/td[1]/div/div[1]/a")).click();
		  driver.findElement(By.xpath("//*[@id=\'bid_button\']/span")).click();
		  driver.findElement(By.id("agreeterm-styler")).click();
		  driver.findElement(By.xpath("//*[@id=\'contract_send\']/span")).click();
		  String acturl= driver.getCurrentUrl();
		  String expurl=("https://qatest.twoplugs.com/postContract");
		  Assert.assertEquals(acturl, expurl);
		  driver.close();
				  
				  
				  }

}
