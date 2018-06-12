package com.myProject.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.myProject.testdata.Constant;
import com.myProject.pageobjects.HomePage;
import com.myProject.pageobjects.SignInPage;
import com.myProject.utilities.SignIn;

public class TP_011 {
	@Test
	public void TC011() throws InterruptedException {
		
			System.setProperty("webdriver.gecko.driver","./src\\twoPLUGS\\test\\resources\\geckodriver.exe"); 
			WebDriver driver = new FirefoxDriver();
			  driver.get(Constant.url);
			  //driver.get(Constant.url);
			  SignInPage login=new SignInPage(driver);
			
			  login.setUsername("joy");
			  
			  login.setPassword("test2plug");
			  login.clickLogin();
			 
			  driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			  HomePage hp = new HomePage(driver);
			  hp.setSearchText("ride");
			 
			WebElement add = driver.findElement(By.xpath("/html/body/div[7]/div/div[2]/div/table/tbody/tr[3]/td[1]/div/div[1]/a"));
			
			
			
			//System.out.println(add);
			
			  
			  //JavascriptExecutor js1=(JavascriptExecutor) driver;
			  // js1.executeScript("window.scrollBy(0,100)","");
			//Thread.sleep(5000);
			JavascriptExecutor ex=(JavascriptExecutor)driver;
			  ex.executeScript("arguments[0].click()", add);
			 
			  WebElement bid= driver.findElement(By.xpath("//*[@id=\'bid_button\']"));
			   JavascriptExecutor ex1=(JavascriptExecutor)driver;
				  ex1.executeScript("arguments[0].click()", bid);
				  Thread.sleep(2000);
				  WebElement price=driver.findElement(By.xpath("//*[@id=\'price\']"));
				  price.clear();
				  price.sendKeys("10");
				  
			   driver.findElement(By.xpath("//*[@id=\'agreeterm-styler\']")).click();
			   driver.findElement(By.xpath("//*[@id=\'contract_send\']/span")).click(); 
			 String currenturl=driver.getCurrentUrl();
			 String expectedurl= ("https://qatest.twoplugs.com/postContract");
			   
			   
			  Assert.assertEquals(currenturl,expectedurl);
			 driver.close();
	}
	}



