package withoutPOM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_Without_POM {
	
	public WebDriver driver;

	@BeforeClass
	public void initDriver() {
		WebDriverManager.firefoxdriver().setup();
		//driver = new ChromeDriver();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/books");
	}
	
	@Test(priority = 1)
	public void login() {
		driver.findElement(By.xpath("//button[@id='login']")).click();
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("gunjankaushik");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password@123");
		driver.findElement(By.xpath("//button[@id='login']")).click();
	}
	
	@Test(priority = 2)
	public void logoff() {
		String userName = driver.findElement(By.id("userName-value")).getText();
		System.out.println("User profil name = " +userName);
		driver.findElement(By.xpath("//button[@id='submit']")).click();
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
