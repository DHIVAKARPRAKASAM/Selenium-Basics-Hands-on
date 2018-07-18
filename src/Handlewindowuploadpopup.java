import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlewindowuploadpopup {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.linkText("Login & Signup")).click();

		Alert alert=driver.switchTo().alert();
		alert.dismiss();
		//driver.findElement(By.id("fileupload")).sendKeys("Desktop/d.txt");
	}

}
