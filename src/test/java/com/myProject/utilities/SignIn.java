package com.myProject.utilities;

import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import com.myProject.pageobjects.SignInPage;


public class SignIn {
	public static WebDriver driver;
    public static SoftAssert asrt;
           
	public static void Execute (WebDriver driver, String sUsername, String sPassword){
		
	SignInPage signinpage = new SignInPage(driver);
    asrt=new SoftAssert();
    
   
    signinpage.setUsername(sUsername);
    signinpage.setPassword(sPassword);
    signinpage.clickLogin();
   
    asrt.assertAll();
}}


