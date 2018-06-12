package com.myProject.testcases;

import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.Alert;
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
import com.myProject.pageobjects.HomePage;
import com.myProject.pageobjects.SignInPage;

public class TP_007 {
	
	
	@Test
	public void TC007() throws InterruptedException {
		
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
		  //verifying transfer
		  
		driver.findElement(By.xpath("/html/body/div[7]/section/div[1]/div/div[2]/div[2]/ul/li[2]/a/span")).click();
		String currentURL = null;
		String Expected= ("https://qatest.twoplugs.com/transfermoney/jain");
				
	     
	    if(driver.findElement(By.xpath("/html/body/div[7]/section/div/form/div[3]/ul/li[2]/a/span")).isEnabled())
	    {
	        
	        currentURL = driver.getCurrentUrl();
	        Assert.assertEquals(currentURL,Expected);
	        
	        System.out.println(currentURL);
	        driver.navigate().back();
	        
	        //verifying message
	        
	        
	        driver.findElement(By.xpath("//*[@id=\'messageforperosnal\']/span")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//*[@id='messagetitle']")).sendKeys("test");
	        driver.findElement(By.xpath("//*[@id='messagecontent']")).sendKeys("test");
	        driver.findElement(By.xpath("//*[@id='message_send']/span")).click();
	        System.out.println(driver.findElement(By.xpath("//*[@id=\'messageSendModalmessage\']/div/div")).getText());
	        
	        
	      //*[@id="messagetitle"]
	       
	       /*String title1=driver.findElement(By.xpath("//*[@id=\'modaltitle\']")).getText();
	       System.out.println(title1);*/
	        
			 //Thread.sleep(2000);
			 //WebDriverWait mywait=new WebDriverWait(driver,10000);
		      //  WebElement msg =mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\'message_form\']/div/div/div/button/span")));
	       
	        //driver.findElement(By.xpath("//*[@id=\'message_form\']/div/div/div/button/span")).click();
	       // msg.click();
		    
		       // driver.navigate().back();
	        
		//verifying report
		        
		       // WebDriverWait mywait=new WebDriverWait(driver,10000);
		        //WebElement Report =mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[7]/section/div[1]/div/div[2]/div[2]/ul/li[4]/a/span")));
				//Report.click();
		        
		        
		        
		       //driver.findElement(By.xpath("/html/body/div[7]/section/div[1]/div/div[2]/div[2]/ul/li[4]/a/span")).click();
		        
		        
				WebElement element=driver.findElement(By.xpath("/html/body/div[7]/section/div[1]/div/div[2]/div[2]/ul/li[4]/a/span"));    
				JavascriptExecutor ex=(JavascriptExecutor)driver;
				  ex.executeScript("arguments[0].click()", element);
				  Thread.sleep(2000);
				  
				  String expected1= ("https://qatest.twoplugs.com/complaintUser/jain");
				  String actual1= driver.getCurrentUrl();
				  Assert.assertEquals(actual1, expected1);
				  System.out.println(actual1);
				  
				  
				    	  
	}
	    else {
	    	Assert.assertTrue(false);
	    }

	    driver.close();
	}}

