import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameinCRM {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.freecrm.com/index.cfm?CFID=117857&CFTOKEN=c3bb65ec3b0d0199-219EDFCA-FA4E-390D-6E4F1ED3F1CAF717&jsessionid=9430a8e9f560ebcfcb812f2f4779192a1310");
		driver.switchTo().frame("mainpanel");
		driver.findElement(By.linkText("Contacts")).click();
	
	}

}
