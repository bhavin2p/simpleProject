package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By uName = By.xpath("//input[@id='userName']");
	
	By pwd = By.xpath("//input[@id='password']");
	
	By loginBtn = By.xpath("//button[@id='login']");
	
	public void enterUserName(String userName) {
		driver.findElement(uName).sendKeys(userName);
	}
	
	public void enterPassWord(String password) {
		driver.findElement(pwd).sendKeys(password);
	}

	
	public void enterDetails(String userName, String password) {
		driver.findElement(uName).sendKeys(userName);
		driver.findElement(pwd).sendKeys(password);
	}
	
	
	public void clickLogin() {
		driver.findElement(loginBtn).click();
	}
}
