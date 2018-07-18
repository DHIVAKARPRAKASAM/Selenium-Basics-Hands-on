import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	driver.get("http://www.popuptest.com/goodpopups.html");
	
	driver.findElement(By.linkText("Good PopUp #3")).click();
	
	Set<String> st=driver.getWindowHandles();
	
	Iterator<String> it=st.iterator();
	
	String s1=it.next();
	System.out.println(s1);
	
	String s2=it.next();
	System.out.println(s2);
	
	driver.switchTo().window(s2);
	System.out.println(driver.getTitle());
	
	driver.close();
	
	driver.switchTo().window(s1);
	
	System.out.println(driver.getTitle());
	
}
}
