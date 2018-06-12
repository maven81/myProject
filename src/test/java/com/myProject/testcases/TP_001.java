package com.myProject.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.myProject.testdata.Constant;
import com.myProject.utilities.SignIn;

public class TP_001 {	
	//Sign up_valid user
	//String url = "https://qatest.twoplugs.com/home";
	  @Test
	  public void TC_001() {
		  //WebDriver driver = new FirefoxDriver();
		  System.setProperty("webdriver.gecko.driver","/usr/local/bin/geckodriver"); 
		  WebDriver driver = new FirefoxDriver();
		  driver.get(Constant.url);
		  SignIn.Execute(driver, Constant.Username, Constant.Password); 
		  driver.close();
}}
