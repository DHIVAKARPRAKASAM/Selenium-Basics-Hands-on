import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorsDemo {
public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://reg.ebay.in/reg/PartialReg?ru=https%3A%2F%2Fwww.ebay.in%2F");
	
	driver.findElement(By.id("email")).sendKeys("dhivayapramil@gmail.com");
	driver.findElement(By.xpath("pass"));
	
	//driver.findElement(By.xpath("//input[@test-id='test-username']"))	//driver.quit();
}
}
