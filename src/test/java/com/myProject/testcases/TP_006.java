package com.myProject.testcases;

import static org.testng.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.myProject.testdata.Constant;
import com.myProject.pageobjects.HomePage;
import com.myProject.utilities.SignIn;

public class TP_006 {
	@Test
	public void TC006() throws InterruptedException {
		
			  System.setProperty("webdriver.gecko.driver","./src\\twoPLUGS\\test\\resources\\geckodriver.exe"); 
			  WebDriver driver = new FirefoxDriver();
			  driver.get(Constant.url);
			  SignIn.Execute(driver, Constant.Username, Constant.Password); 
			  HomePage hp = new HomePage(driver);
			  hp.setSearchText("car ride");
			  
			String msg = driver.findElement(By.xpath("/html/body/div[7]/div/div[2]/div/table/tbody/tr[1]/td[1]/div/div[1]/a")).getText();
			
			System.out.println(msg);
			  
			Assert.assertEquals(msg, "CAR SHARE");
			  driver.close();
	}
	}


