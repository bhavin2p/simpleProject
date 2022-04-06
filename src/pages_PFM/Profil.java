package pages_PFM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class Profil {
	
	final WebDriver driver;
	
	public Profil(WebDriver driver) {
		this.driver=driver;
	}
	
	@FindBys({
		@FindBy(id="books-wrapper"),
		@FindBy(id="userName-value")
	})
	WebElement user;

	@CacheLookup
	@FindBy(id="submit")
	WebElement logoutBtn;
	
	public void verifyUser(String userName) {
		if(user.getText().equalsIgnoreCase(userName))
			System.out.println("Correct UserName ie - " +user.getText());
		else
			System.out.println("Incorrect UserNAme - " +user.getText());
	}
	
	public void logout_Action() {
		System.out.println("Let's logoff now");
		logoutBtn.click();
	}
}
