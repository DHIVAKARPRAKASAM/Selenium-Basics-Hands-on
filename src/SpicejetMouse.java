import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SpicejetMouse {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://www.spicejet.com/");
		
		Actions ac=new Actions(driver);
		ac.moveToElement(driver.findElement(By.linkText("MENU"))).build().perform();
		
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Tariffs")).click();
	}
}
