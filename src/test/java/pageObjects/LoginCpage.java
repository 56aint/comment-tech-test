package pageObjects;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class LoginCpage {
	public WebDriver driver;
	public LoginCpage(WebDriver ldriver) {
		driver = ldriver;
		PageFactory.initElements(ldriver, this);	
	}
	
	By lnkSign =  By.xpath("//span[@class='ssrcss-13xlmwo-AccountText eki2hvo13'][contains(text(),'Sign in')]");
	By txtEmail = By.xpath("//input[@id='user-identifier-input']");
	By txtPassword = By.xpath("//input[@id='password-input']");
	By btnSignIn = By.xpath("//button[@class='button button--full-width']"); 
	
	public void setSign() {
		driver.findElement(lnkSign).click();
	}
	
	public void setUsername(String uname) {
		driver.findElement(txtEmail).clear();
		driver.findElement(txtEmail).sendKeys(uname);
	}
	
	public void setPassword(String pswd) {
		driver.findElement(txtPassword).clear();
		driver.findElement(txtPassword).sendKeys(pswd);
	}
	
	public void setbtnSign() {
		driver.findElement(btnSignIn).click();
	}
}
