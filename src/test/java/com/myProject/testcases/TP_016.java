package com.myProject.testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;


import com.myProject.testdata.Constant;
import com.myProject.pageobjects.NavigationBarPage;
import com.myProject.pageobjects.SettingsPage;
import com.myProject.pageobjects.Settings_VerifyYourIdPage;
import com.myProject.utilities.SignIn;

public class TP_016 {
	@Test
	public void TC016() throws InterruptedException, IOException{
		System.setProperty("webdriver.gecko.driver","./src\\twoPLUGS\\test\\resources\\geckodriver.exe"); 
		  WebDriver driver = new FirefoxDriver();
		  driver.get(Constant.url);
		  SignIn.Execute(driver, Constant.Username, Constant.Password); 
		  driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		  		  NavigationBarPage np= new NavigationBarPage(driver);
		  np.clickUserMenu();
		  //Thread.sleep(5000);
		  np.clickSettings();
		  SettingsPage set= new SettingsPage(driver);
		  set.clickVerifyIdTab();
		  //Settings_VerifyYourIdPage verifyID = new Settings_VerifyYourIdPage(driver);
		 // verifyID.clickChooseFileBtn();
		 WebElement add= driver.findElement(By.xpath("//*[@id=\'idimage\']"));
		  JavascriptExecutor ex=(JavascriptExecutor)driver;
		  ex.executeScript("arguments[0].click()", add);
		  Runtime.getRuntime().exec("C:/Users/Harjot/Desktop/idupload.exe");
		  Thread.sleep(1000);
		  String img= driver.findElement(By.xpath("/html/body/div[7]/div/form/div/div/div/div/div[2]/div/div/div[1]")).getText();
		  System.out.println(img);
		  String exp = ("sample.jpg");
		  Assert.assertEquals(img,exp);
		driver.close();
	}
	
	

}
