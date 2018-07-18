import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmaildropdown {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ltmpl=default&flowName=GlifWebSignIn&flowEntry=SignUp");
	
	//driver.findElement(By.click();
	
	//WebElement d=
Scroll(driver);
driver.findElement(By.xpath("//div[contains(@class,'MocG8c B9IrJb LMgvRb KKjvXb')")).click();
	}





public static void Scroll(WebDriver driver)
{
	JavascriptExecutor js=((JavascriptExecutor)driver);
	js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
}

}
