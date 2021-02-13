package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.LoginCpage;

import io.cucumber.java.en.*;

public class Steps {
	
	public WebDriver driver;
	public LoginCpage lcp;
	
	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		
		lcp=new LoginCpage(driver);
	}

	@When("User opens URL {string}")
	public void user_opens_url(String url) {
		driver.get(url);
		driver.manage().window().maximize();
		driver .manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@When("Click on Sign in icon")
	public void click_on_sign_in_icon() {
		lcp.clickSign();
	}

	@When("User enters Email as {string} and Password as {string}")
	public void user_enters_email_as_and_password_as(String email, String password) {
	   lcp.setUsername(email);
	   lcp.setPassword(password);
	}
	
	@When("Click on Sign in Button")
	public void click_on_sign_in_button() {
	    lcp.clickbtnSign();
	    driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	}

	@Then("Page Title should be {string}")
	public void page_title_should_be(String title) {
			System.out.println("Page title is : " + driver.getTitle());
			Assert.assertEquals(title, driver.getTitle());
		
	}

	@When("User clicks on username icon")
	public void user_clicks_on_username_icon() {
	    lcp.clickUnameIcon();
	}

	@Then("User clicks on sign out link")
	public void user_clicks_on_sign_out_link() {
	    lcp.clicklnkSignOut();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Then("close browser")
	public void close_browser() {
	    driver.quit();
	}
}
