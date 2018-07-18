import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenlinkTest {

	public static void main(String[] args) throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		
		List<WebElement> lst=driver.findElements(By.tagName("a"));
		lst.addAll(driver.findElements(By.tagName("img")));
		System.out.println(lst.size());
		
		List<WebElement> arrLst=new ArrayList<WebElement>();
		
		for(int i=0;i<lst.size();i++) {
			if(lst.get(i).getAttribute("href") != null) {
			arrLst.add(lst.get(i));
			}
		}
		System.out.println(arrLst.size());
		
		for(int j=0;j<arrLst.size();j++)
		{
			HttpURLConnection connection=(HttpURLConnection)new URL(arrLst.get(j).getAttribute("href")).openConnection();
			connection.connect();
			String s=connection.getResponseMessage();
			connection.disconnect();
			System.out.println(arrLst.get(j).getAttribute("href")+"---------"+ s);
		}
		driver.close();
		

	}

}
