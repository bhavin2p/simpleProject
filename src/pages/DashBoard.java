package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashBoard {
	
	WebDriver driver;
	
	public DashBoard(WebDriver driver) {
		this.driver = driver;
	}
	
	By profilName = By.id("userName-value");
	By logoff = By.xpath("//button[@id='submit']");
	
	public String getProfileName() {
		String profile = driver.findElement(profilName).getText();
		return profile;
	}
	
	public void clickLogout() {
		driver.findElement(logoff).click();
	}

}
