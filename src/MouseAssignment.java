import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAssignment {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	driver.get("http://www.spicejet.com/");
	
	Actions ac=new Actions(driver);
	
	Thread.sleep(3000);
	
	ac.moveToElement(driver.findElement(By.xpath("//*[@id='ctl00_HyperLinkLogin']"))).build().perform();
	Thread.sleep(2000);
	ac.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'SpiceCash/SpiceClub Members')])"))).moveToElement(driver.findElement(By.linkText("Sign up"))).click().build().perform();
	
}
}
