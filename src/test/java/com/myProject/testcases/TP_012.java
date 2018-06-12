package com.myProject.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.myProject.testdata.Constant;
import com.myProject.pageobjects.HomePage;
import com.myProject.utilities.SignIn;

public class TP_012 {
	@Test
	public void TC012() throws InterruptedException {
		
		
			  System.setProperty("webdriver.gecko.driver","/usr/local/bin/geckodriver"); 
			  WebDriver driver = new FirefoxDriver();
			  driver.get(Constant.url);
			  SignIn.Execute(driver, Constant.Username, Constant.Password); 
			  HomePage hp = new HomePage(driver);
			  hp.setSearchText("ride");
				 
				WebElement add = driver.findElement(By.xpath("/html/body/div[7]/div/div[2]/div/table/tbody/tr[3]/td[1]/div/div[1]/a"));
				
			  			  
				JavascriptExecutor ex=(JavascriptExecutor)driver;
				  ex.executeScript("arguments[0].click()", add);
				  JavascriptExecutor js1=(JavascriptExecutor) driver;
				  js1.executeScript("window.scrollBy(0,700)","");
				  Thread.sleep(1000);
				  WebElement buy= driver.findElement(By.xpath("/html/body/div[7]/section/div/div[3]/div/a/span"));
				   JavascriptExecutor ex1=(JavascriptExecutor)driver;
					  ex1.executeScript("arguments[0].click()", buy);
					  Thread.sleep(200);
				   driver.findElement(By.xpath("//*[@id=\'chk_buyer_disclaimer-styler\']")).click();
				   driver.findElement(By.xpath("//*[@id=\'btn_confirmbuyService\']/span")).click(); 
				 String currenturl=driver.getCurrentUrl();
				 String expectedurl= ("https://qatest.twoplugs.com/postBuy");
				   
				   
				  Assert.assertEquals(currenturl,expectedurl);
				 driver.close();
		}
		}



