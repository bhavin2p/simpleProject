package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.DashBoard;
import pages.HomePage;
import pages.LoginPage;

public class LoginTestCase {
	
	WebDriver driver;
	HomePage home;
	DashBoard dashBoard;
	LoginPage login;
	
	@BeforeClass
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://demoqa.com/books");
		home = new HomePage(driver);
		login = new LoginPage(driver);
		dashBoard = new DashBoard(driver);
		home.clickLogin();
	}
	
	@Test(priority = 1)
	public void loginTest() throws InterruptedException {
		login.enterDetails("gunjankaushik", "Password@123");
		login.clickLogin();
		Thread.sleep(5000);
		
	}
	
	@Test(priority = 2)
	public void dashBoardTest() {
		String profilName = dashBoard.getProfileName();
		System.out.println("Profil Name = " +profilName);
	}
	
	@AfterClass
	public void tearDown() {
		dashBoard.clickLogout();
		driver.quit();
	}
	

}
