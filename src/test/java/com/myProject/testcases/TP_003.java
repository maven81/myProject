package com.myProject.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


import com.myProject.testdata.Constant;
import com.myProject.pageobjects.SignInPage;
import com.myProject.utilities.SignIn;

public class TP_003 {
	@Test
	public void Validemail() {
		System.setProperty("webdriver.gecko.driver","/usr/local/bin/geckodriver"); 
		  WebDriver driver = new FirefoxDriver();
		  driver.get(Constant.url);
		  SignInPage login=new SignInPage(driver);
			
		  login.setUsername("joy");
		  
		  login.setPassword("test2plug");
		  login.clickLogin(); 
		  String actual= driver.getCurrentUrl();
		  Assert.assertEquals("https://qatest.twoplugs.com/home", actual);
		  driver.close();
	}
	

}
