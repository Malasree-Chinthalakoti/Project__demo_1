package Program_s.Package_s;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_product_page {
WebDriver driver;
@FindBy(xpath="(//div[@class='a-section aok-relative s-image-tall-aspect'])[1]")
WebElement first_shoe;
public void first_product() {
	first_shoe.click();
}
Amazon_product_page(WebDriver driver){
	PageFactory.initElements(driver, this);
}
}
