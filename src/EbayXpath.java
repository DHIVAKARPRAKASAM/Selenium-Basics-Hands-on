import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EbayXpath {
public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://reg.ebay.com/reg/PartialReg?siteid=0&co_partnerId=0&UsingSSL=1&rv4=1&ru=https%3A%2F%2Fwww.ebay.com%2F&signInUrl=https%3A%2F%2Fwww.ebay.com%2Fsignin%3Fsgn%3Dreg%26siteid%3D0%26co_partnerId%3D0%26UsingSSL%3D1%26rv4%3D1%26ru%3Dhttps%253A%252F%252Fwww.ebay.com%252F");
		
		//driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("dhiva");
		//driver.findElement(By.xpath("//input[@class,'fld wide wide fld']")).sendKeys("dhiva");
		
		List<WebElement> lst=driver.findElements(By.tagName("a"));
		System.out.println(lst.size());
		
		for(int i=0;i<lst.size();i++)
		{
			System.out.println(lst.get(i).getText());
		}
	}
}
