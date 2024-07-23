package Program_s.Package_s;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Itestlistenerclass.class)
public class Testcase4 extends  Itestlistenerclass{
	@Test
	public void login() {
		 driver=new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F%26tag%3Dgooghydrabk1-21%26ref%3Dnav_custrec_signin%26adgrpid%3D155259813113%26hvpone%3D%26hvptwo%3D%26hvadid%3D674842289479%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D12352182519584304568%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9182757%26hvtargid%3Dkwd-304880464215%26hydadcr%3D14450_2316420%26gad_source%3D1&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		Amazon_login_page ap=new Amazon_login_page(driver);
		
		
		ap.un();
		
		ap.continue_button();
		ap.pwd();
		ap.signin_button();
		Amazon_home_page s1=new Amazon_home_page(driver);
		s1.search_field();
		Amazon_product_page apg=new Amazon_product_page(driver);
		apg.first_product();
	Set<String> s2=driver.getWindowHandles();
	Iterator<String> pcid=s2.iterator();
	String parentid=pcid.next();
	String childid=pcid.next();
	driver.switchTo().window(childid);
	Amazon_productresult_page apg2=new Amazon_productresult_page(driver);
	apg2.add_wishlist();
	apg2.view_whish_list();
	apg2.add_to_cart();
	WebElement viewwishlist=driver.findElement(By.xpath("//span[@id='pab-I1A347PPINIKJ4']"));
	Assert.assertEquals(viewwishlist.isDisplayed(), true);
	
	}
}
