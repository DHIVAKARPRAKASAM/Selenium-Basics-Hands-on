import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HeadlessConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver=new HtmlUnitDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		driver.findElement(By.id("email")).sendKeys("dhivayapramil@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("9443943941");
		driver.findElement(By.xpath("//*[@id=\"u_0_2\"]")).click();
		System.out.println(driver.getTitle());
		driver.close();

	}

}
