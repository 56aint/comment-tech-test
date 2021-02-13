package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class CommentPage {
	public WebDriver driver;
	public CommentPage(WebDriver ldriver) {
		driver = ldriver;
		PageFactory.initElements(ldriver, this);	
	}
	
	
	By txtareabox = By.xpath("//input[@class='comments-input-box']");
	     
	
	public void clickTxtareabox() {
		driver.findElement(txtareabox).click();
	}
}



	

