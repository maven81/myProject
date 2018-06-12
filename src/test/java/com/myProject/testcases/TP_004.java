package com.myProject.testcases;

import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.myProject.testdata.Constant;
import com.myProject.pageobjects.SignInPage;
//import com.myProject.utilities.SignIn;

public class TP_004 {
	@Test
	public void InValidUser() {
		System.setProperty("webdriver.gecko.driver","./src\\twoPLUGS\\test\\resources\\geckodriver.exe"); 
		  WebDriver driver = new FirefoxDriver();
		  driver.get(Constant.url);
		  SignInPage login=new SignInPage(driver);
		  login.setUsername("joy1");
		  login.setPassword("test2plug");
		  login.clickLogin();
		 
		String actual=driver.findElement(By.xpath("/html/body/div[7]/div/form/div[2]/div")).getText();
			String Expected=("INVALID EMAIL/PASSWORD.");
			Assert.assertEquals(Expected, actual);
			driver.close();
		
	
}
}


