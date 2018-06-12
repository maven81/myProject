package com.myProject.testcases;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.myProject.testdata.Constant;
import com.myProject.pageobjects.AddANeedPage;
import com.myProject.pageobjects.NavigationBarPage;
import com.myProject.pageobjects.NeedEditPage;
import com.myProject.utilities.SignIn;


public class TP_009 {
	
	

	
		@Test
		public void TC_009() throws InterruptedException {
			System.setProperty("webdriver.gecko.driver","./src\\twoPLUGS\\test\\resources\\geckodriver.exe");
			   WebDriver driver=new FirefoxDriver();
			   driver.get(Constant.url);
			   SignIn.Execute(driver, Constant.Username, Constant.Password); 
			   NavigationBarPage search=new NavigationBarPage(driver);
			   search.clickCreateNewServiceDropDown();
			   search.clickCreateNewNeed();
			   driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			   AddANeedPage need=new AddANeedPage(driver);
			   need.SetTitle("Car Wash");
			   need.SetDescription("I need someone who can wash my car");
			   
			   driver.findElement(By.xpath("/html/body/div[7]/div[1]/form/div[2]/div[1]/div/div/div[1]/div[1]")).click();
			   driver.findElement(By.xpath("/html/body/div[7]/div[1]/form/div[2]/div[1]/div/div/div[2]/ul/li[5]")).click();
			   
			   //Thread.sleep(500); 
			   
			  driver.findElement(By.xpath("/html/body/div[7]/div[1]/form/div[2]/div[2]/div/div/div[1]/div[1]")).click();
			  driver.findElement(By.xpath("/html/body/div[7]/div[1]/form/div[2]/div[2]/div/div/div[2]/ul/li[6]")).click();
			   
			   
			   need.SetPrice("25");
			   
			   need.ClickCreateButton();
			   String needmsg= driver.findElement(By.xpath("/html/body/div[7]/div/div")).getText();
			   System.out.println(needmsg);
			   String actualneedmsg= ("Need has been added");
			   Assert.assertEquals(actualneedmsg, needmsg);
			   
			   //editing the need
			  System.out.println("Editing the need");
					   
					   //NeedEditPage edit=new NeedEditPage(driver);
					   //edit.clickEditNeed();
					  //edit.clickEditIcon();
					 // driver.findElement(By.xpath("html/body/div[7]/section/div/div[2]/div[1]/div/div/div/a")).click();
			//EDITING A NEED
			   driver.navigate().refresh();
			   WebElement userMenu= driver.findElement(By.cssSelector("span.w-icons-hiUser"));
				
				WebElement profile=driver.findElement(By.xpath("/html/body/div[7]/nav/div/div[2]/ul/li[4]/ul/li[1]/a/span[2]"));
				
				 Actions act=new Actions(driver);
				act.moveToElement(userMenu).moveToElement(profile).build().perform();
			   //search.clickUserMenu();
			   search.clickProfile();
			   
			   JavascriptExecutor js1=(JavascriptExecutor) driver;
			   js1.executeScript("window.scrollBy(0,500)","");
			   
			   driver.findElement(By.xpath("/html/body/div[7]/div[4]/div[2]/div[1]/div[1]/table/tbody/tr[63]/td[2]/ul/li[1]/a/span")).click();
			  
			  
			  need.SetDescription("I need someone who can wash my car, clean from inside and polish");
			     driver.findElement(By.xpath("/html/body/div[7]/div[1]/form/div[4]/div[5]/ul/li[2]/button")).click();
			  String updatemsg= driver.findElement(By.xpath("/html/body/div[7]/div/div")).getText();
			   System.out.println(updatemsg);
			   String actualmsg= ("Need has been updated");
			   Assert.assertEquals(actualmsg, updatemsg);
			  
			     driver.close();
			     
			   
			
		}

	}


