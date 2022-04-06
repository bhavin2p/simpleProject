package testcases_PFM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages_PFM.Login;
import pages_PFM.Profil;

public class Login_TC {
	
	static WebDriver driver;
	Login loginPg;
	Profil profPg;
	
	@BeforeClass
	public void Setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/books");
	}
	
	@BeforeTest
	public void PFMInit() {
		loginPg = PageFactory.initElements(driver, Login.class);
		profPg = PageFactory.initElements(driver, Profil.class);
		
	}
	@Test
	public void action() {
		loginPg.LoginAction("gunjankaushik", "Password@123");
		profPg.verifyUser("gunjankaushik");
		
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
	

}
