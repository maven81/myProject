package com.myProject.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.myProject.testdata.Constant;
import com.myProject.pageobjects.SignInPage;
import com.myProject.pageobjects.SignUpPage;

public class TP_002 {
	@Test
	public void TC002() {
		System.setProperty("webdriver.gecko.driver","/usr/local/bin/geckodriver"); 
		  WebDriver driver = new FirefoxDriver();
		  driver.get(Constant.url);
		  SignInPage login=new SignInPage(driver);
		  login.clickSignUp();
		  SignUpPage sp=new SignUpPage(driver);
		  
		  sp.setUsername("joy");
		  sp.setPassword("test2plug");
		  sp.clicksignup();
		  String actmessage=driver.findElement(By.xpath("/html/body/div[7]/div/div/form/div[2]/div[2]/div/p")).getText();
		  String expmessage=("The username has already been taken.");
		  Assert.assertEquals(actmessage, expmessage);
		  driver.close();
	}
	

}
