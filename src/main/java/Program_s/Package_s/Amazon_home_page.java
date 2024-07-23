package Program_s.Package_s;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Amazon_home_page {
static WebDriver driver;
	@FindBy(id="twotabsearchtextbox")
WebElement search;
public void search_field() {
	search.sendKeys("shoe"+Keys.ENTER);
}
Amazon_home_page(WebDriver driver){
	PageFactory.initElements(driver, this);
	//Assert.assertEquals(search.isEnabled(), true);
}



}
