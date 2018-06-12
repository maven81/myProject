package com.myProject.testcases;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.myProject.testdata.Constant;
import com.myProject.pageobjects.NavigationBarPage;
import com.myProject.pageobjects.SettingsPage;
import com.myProject.pageobjects.Settings_ServiceMatchPage;
import com.myProject.utilities.SignIn;

public class TP_017 {
	@Test 
	public void TC017() throws InterruptedException
		{
		System.setProperty("webdriver.gecko.driver","/usr/local/bin/geckodriver"); 
		  WebDriver driver = new FirefoxDriver();
		  driver.get(Constant.url);
		  SignIn.Execute(driver, Constant.Username, Constant.Password); 
		  driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		  		  NavigationBarPage np= new NavigationBarPage(driver);
		  np.clickUserMenu();
		  Thread.sleep(2000);
		  np.clickSettings();
		  SettingsPage set= new SettingsPage(driver);
		  set.clickServiceMatch();
		  Settings_ServiceMatchPage addservice = new Settings_ServiceMatchPage(driver);
		  JavascriptExecutor js1=(JavascriptExecutor) driver;
		   js1.executeScript("window.scrollBy(0,900)","");
		   driver.findElement(By.xpath("/html/body/div[7]/div/form/div/div/div/div/div[1]/div/div/div[1]/div[2]/div")).click();
		   driver.findElement(By.xpath("/html/body/div[7]/div/form/div/div/div/div/div[1]/div/div/div[2]/ul/li[1]")).click();
		   driver.findElement(By.xpath("/html/body/div[7]/div/form/div/div/div/div/div[2]/div/div/div[1]/div[2]")).click();
		   driver.findElement(By.xpath("/html/body/div[7]/div/form/div/div/div/div/div[2]/div/div/div[2]/ul/li[2]")).click();
		   driver.findElement(By.xpath("/html/body/div[7]/div/form/div/div/div/div/div[3]/div/div/div[1]/div[2]/div")).click();
		   driver.findElement(By.xpath("/html/body/div[7]/div/form/div/div/div/div/div[3]/div/div/div[2]/ul/li[3]")).click();
		   
		   
		   
		 /* addservice.selectTypeOfMatch("service");
		  addservice.selectCategory("Art & Phtography");
		  addservice.selectSubCategory("Photography");*/
		  addservice.clickAdd();
		  
		  String addmsg=driver.findElement(By.xpath("/html/body/div[7]/div/div")).getText();
		  
		  String expectedmsg=("A match has been added");
		  Assert.assertEquals(expectedmsg,addmsg);
		  
		  
		  driver.close();
		  
		  

}
}
