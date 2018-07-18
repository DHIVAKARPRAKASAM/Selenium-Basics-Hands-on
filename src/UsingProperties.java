import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UsingProperties {
	static WebDriver driver;
public static void main(String[] args) throws IOException {
	
	Properties pr=new Properties();
	
	FileInputStream fs=new FileInputStream("C:\\Users\\dhiva\\eclipse-workspace\\Selenium\\src\\config.properties");
	
	pr.load(fs);
	
	System.out.println(pr.getProperty("name"));
String s1=pr.getProperty("browser");
String s2=pr.getProperty("url");
	
	if(s1.equals("chrome")) {
	System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	 driver=new ChromeDriver();
	driver.manage().window().maximize();
	}
	else if(s1.equals("FF")) {
		System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
	 driver=new FirefoxDriver();
		driver.manage().window().maximize();
		}
	
	
	driver.get(s2);
	driver.close();
}
}
