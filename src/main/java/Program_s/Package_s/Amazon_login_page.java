package Program_s.Package_s;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_login_page {
WebDriver driver;
@FindBy(id="ap_email")
WebElement username;
@FindBy(id="continue")
WebElement contnue;
@FindBy(id="ap_password")
WebElement password;
@FindBy(id="signInSubmit")
WebElement signin;
public void un() {
	username.sendKeys("7569889622");
}
public void continue_button() {
	contnue.click();
}
public void pwd() {
	password.sendKeys("Madhumal@1");
}
public void signin_button() {
	signin.click();
}
Amazon_login_page(WebDriver driver){
	PageFactory.initElements(driver, this);
}
}
