package pages_PFM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Login {
	
	final WebDriver driver;
	
	public Login(WebDriver driver) {
		this.driver=driver;
	}
	
	@FindBy(how=How.XPATH, using = "//button[@id='login']")
	WebElement login;
	
	@FindAll({
		@FindBy(id = "wrapper"),
		@FindBy(id = "userName")
	})
	WebElement username;
	
	@FindBy(how=How.ID, using = "password")
	WebElement pwd;
	
	@FindBy(id="login")
	WebElement loginBtn;
	
	
	public void LoginAction(String uName, String password) {
		login.click();
		username.sendKeys(uName);
		pwd.sendKeys(password);
		loginBtn.click();
	}

}
