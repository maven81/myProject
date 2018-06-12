package com.myProject.testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.myProject.testdata.Constant;
import com.myProject.pageobjects.AddAservicePage;
import com.myProject.pageobjects.NavigationBarPage;
import com.myProject.pageobjects.ServiceEditPage;
import com.myProject.utilities.SignIn;

public class TP_008 {
	@Test
	public void TC008() throws InterruptedException {
		
		
		System.setProperty("webdriver.gecko.driver","/usr/local/bin/geckodriver");
		   WebDriver driver=new FirefoxDriver();
		   driver.get(Constant.url);
		   SignIn.Execute(driver, Constant.Username, Constant.Password); 
		   
		   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		   NavigationBarPage search=new NavigationBarPage(driver);
		   AddAservicePage service= new AddAservicePage(driver); 
		   search.clickCreateNewServiceDropDown();
		   search.clickCreateNewService();
		   driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		  
		   service.SetTitle("Rental property");
		   service.SetDescription("Condo is available for rent-automation testing.");
		   Thread.sleep(2000);
		   //Select Category;
		   driver.findElement(By.xpath("//*[@id=\'category_id-styler\']/div[1]/div[1]")).click();
		   driver.findElement(By.xpath("//*[@id=\'category_id-styler\']/div[2]/ul/li[2]")).click();
		   //Select Sub Category;
		  driver.findElement(By.xpath("//*[@id=\'subcategory_id-styler\']/div[1]/div[1]")).click();
		  driver.findElement(By.xpath("//*[@id=\'subcategory_id-styler\']/div[2]/ul/li[2]")).click();
				
		   
		    
		   service.SetPrice("250");
		   JavascriptExecutor js=(JavascriptExecutor) driver;
		   js.executeScript("window.scrollBy(0,700)","");
		   service.MoveRefundSlider(1);
		   service.SetRefundValid("0");
		   service.ClickCreateButton();
		   Thread.sleep(2000);
		   String addedmsg= driver.findElement(By.xpath("/html/body/div[7]/div/div")).getText();
		   System.out.println(addedmsg);
		   String actualaddedmsg= ("Service has been added");
		   Assert.assertEquals(actualaddedmsg, addedmsg);
		   /*if (actualaddedmsg .equals( addedmsg)){
			   System.out.println("Test case passed for adding service");
		   }
		   else {
			   System.out.println("Test case failed for adding service");
		   };*/
		   
		  //EDITING A SERVICE
		   driver.navigate().refresh();
		   WebElement userMenu= driver.findElement(By.cssSelector("span.w-icons-hiUser"));
			
			WebElement profile=driver.findElement(By.xpath("/html/body/div[7]/nav/div/div[2]/ul/li[4]/ul/li[1]/a/span[2]"));
			
			 Actions act=new Actions(driver);
			act.moveToElement(userMenu).moveToElement(profile).build().perform();
		   search.clickUserMenu();
		   search.clickProfile();
		   
		   JavascriptExecutor js1=(JavascriptExecutor) driver;
		   js1.executeScript("window.scrollBy(0,700)","");
		   
		   driver.findElement(By.xpath("/html/body/div[7]/div[4]/div[2]/div[2]/div[1]/table/tbody/tr[28]/td[4]/ul/li[1]/a/span")).click();
		   //ServiceEditPage se= new ServiceEditPage(driver);
		  //driver.findElement(By.xpath("/html/body/div[7]/section/div/div[2]/div[1]/div/div/div/a")).click();
		  
		 // se.clickEditServices();
		  
		  service.SetDescription("Testing123edit");
		     driver.findElement(By.xpath("/html/body/div[7]/div[1]/form/div[4]/div[5]/ul/li[2]/button")).click();
		  String updatemsg= driver.findElement(By.xpath("/html/body/div[7]/div/div")).getText();
		   System.out.println(updatemsg);
		   String expmsg= ("Service has been updated");
		   Assert.assertEquals(expmsg, updatemsg);
		  
		  //DELETING A SERVICE
		   driver.navigate().refresh();
		   
		   WebElement userMenu1= driver.findElement(By.cssSelector("span.w-icons-hiUser"));
			
			WebElement profile1=driver.findElement(By.xpath("/html/body/div[7]/nav/div/div[2]/ul/li[4]/ul/li[1]/a/span[2]"));
			
			 Actions act1=new Actions(driver);
			act1.moveToElement(userMenu1).moveToElement(profile1).build().perform();
		   //search.clickUserMenu();
		   search.clickProfile();
		   
		   JavascriptExecutor js2=(JavascriptExecutor) driver;
		   js2.executeScript("window.scrollBy(0,900)","");
		driver.findElement(By.xpath("/html/body/div[7]/div[4]/div[2]/div[2]/div[1]/table/tbody/tr[33]/td[4]/ul/li[2]/a/span")).click();
		driver.findElement(By.xpath("/html/body/div[7]/div[2]/div/div/form/div[2]/div/ul/li[2]/a/span")).click();
		
		 String deletemsg= driver.findElement(By.xpath("/html/body/div[7]/div/div")).getText();
		   System.out.println(deletemsg);
		   String actualdeletemsg= ("Service has been deleted");
		   Assert.assertEquals(actualdeletemsg, deletemsg);
		   driver.close();
	}




}
