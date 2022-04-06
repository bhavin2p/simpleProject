package com.datadriver.dataprovider;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.utility.TestUtil;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HalfEbayTest {

	
	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://signup.ebay.com/pa/crte?ru=https%3A%2F%2Fwww.ebay.com%2F");
	}
	
	@DataProvider
	public Iterator<Object[]> getData() {
		ArrayList<Object[]> testdata = TestUtil.getDataFromExcel();
		return testdata.iterator();
	}
	
	
	@Test(dataProvider = "getData")
	public void halfEbayRegistration(String fname, String lname, String email, String pwd) {
		
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys(fname);
		driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys(lname);
		
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd);
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
