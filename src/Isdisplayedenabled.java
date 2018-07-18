import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isdisplayedenabled {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.freecrm.com/register/");
	boolean b1=driver.findElement(By.className("myButton")).isDisplayed();
		System.out.println(b1);
		
		boolean b2=driver.findElement(By.name("agreeTerms")).isSelected();
		System.out.println(b2);
		Thread.sleep(2000);
		driver.close();
		
		
	}

}
