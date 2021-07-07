package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginCpage {
  public WebDriver driver;

  public LoginCpage(WebDriver ldriver) {
    driver = ldriver;
    PageFactory.initElements(ldriver, this);
  }

  By lnkSign = By.xpath(
    "//span[@class='ssrcss-13xlmwo-AccountText eki2hvo13'][contains(text(),'Sign in')]"
  );
  By txtEmail = By.xpath("//input[@id='user-identifier-input']");
  By txtPassword = By.xpath("//input[@id='password-input']");
  By btnSignIn = By.xpath("//button[@class='button button--full-width']");
  By unameIcon = By.xpath("//span[@class='ssrcss-q3rgld-AccountIconWrapper eki2hvo12']");
  By lnkSignOut = By.xpath(
    "//span[@class='primary-nav__item-text'][contains(text(),'Sign out')]"
  );

  public void clickSign() {
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

  public void clickbtnSign() {
    driver.findElement(btnSignIn).click();
  }

  public void clickUnameIcon() {
    driver.findElement(unameIcon).click();
  }

  public void clicklnkSignOut() {
    driver.findElement(lnkSignOut).click();
  }
}
