import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {
public static void main(String[] args) {
	/*System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.youtube.com/");*/
	
	System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.youtube.com/");
	
	String s1=driver.getTitle();
	System.out.println(s1);
	
	if(s1.equals("YouTube"))
			{
		System.out.println("crct");
			}
	else
	{
		System.out.println("wrong");
	}
	
	System.out.println(driver.getCurrentUrl());
	//System.out.println(driver.getPageSource());
	driver.quit();
	
	
}
}
