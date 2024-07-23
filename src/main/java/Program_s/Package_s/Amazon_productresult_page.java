package Program_s.Package_s;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Amazon_productresult_page {
WebDriver driver;
@FindBy(id="wishListMainButton")
WebElement wishlist;
@FindBy(xpath="//span[@id='huc-view-your-list-button']/span/a")
WebElement viewwishlist;
@FindBy(xpath="//span[@id='pab-I1A347PPINIKJ4']")
WebElement addcart;
@FindBy(xpath="//span[@class='a-button a-button-primary g-cart-checkout-btn']/span/a")
WebElement checkout;
@FindBy(xpath="(//span[@class='a-button-text a-declarative'])[1]")
WebElement dropdown1;
@FindBy(id="address-ui-widgets-DetectLocationButton-announce")
WebElement autoselect;
@FindBy(id="address-ui-widgets-enterAddressFullName")
WebElement name;
@FindBy(id="address-ui-widgets-enterAddressPhoneNumber")
WebElement mno;
@FindBy(id="address-ui-widgets-enterAddressPostalCode")
WebElement pincode;
@FindBy(id="address-ui-widgets-enterAddressLine1")
WebElement hno;
@FindBy(id="address-ui-widgets-enterAddressLine2")
WebElement street;
@FindBy(id="address-ui-widgets-landmark")
WebElement landmark;
@FindBy(id="address-ui-widgets-enterAddressCity")
WebElement city;
@FindBy(id="address-ui-widgets-form-submit-button")
WebElement adress;
@FindBy(id="address-ui-widgets-use-as-my-default")
WebElement default_adrs;
public void add_wishlist() {
	wishlist.click();
}
public void view_whish_list() {
	viewwishlist.click();
}
public void add_to_cart() {
	addcart.click();
}
public void proceed_checkout() {
	checkout.click();
}
public void autoselect_1() {
	autoselect.click();
}
public void dropdown_1() {
	Select sc=new Select(dropdown1);
	sc.selectByVisibleText("India");
}
public void fname() {
	name.sendKeys("malasree");
}
public void mobilenumber() {
	mno.sendKeys("9502489669");
}
public void pincode1() {
	pincode.sendKeys("505403");
}
public void hno() {
	hno.sendKeys("2-76");
}
public void area() {
	street.sendKeys("konaipally");
}
public void landmark() {
	landmark.sendKeys("hanumantemple");
}
public void city1() {
	city.sendKeys("vemulawada");
}
public void adress_click() {
	adress.click();
}
public void defaulty() {
	default_adrs.click();
}

Amazon_productresult_page(WebDriver driver){
	PageFactory.initElements(driver, this);
}
}
