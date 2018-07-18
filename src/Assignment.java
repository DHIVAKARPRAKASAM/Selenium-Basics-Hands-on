import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment {
	static WebDriver driver;

	public static void main(String[] args) throws IOException, InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		Properties pr=new Properties();
		
		FileInputStream fr=new FileInputStream("C:\\Users\\dhiva\\eclipse-workspace\\Selenium\\src\\config.properties");
		pr.load(fr);
		
		String s1=pr.getProperty("browser");
		if(s1.equals("chrome")) {
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			} 
		else if(s1.equals("FF")) {
				
				driver=new FirefoxDriver();
				driver.manage().window().maximize();
				}
		driver.get(pr.getProperty("url"));
		driver.findElement(By.xpath("//*[@id=\"ap_customer_name\"]")).sendKeys(pr.getProperty("name"));
		driver.findElement(By.xpath("//*[@id=\"ap_phone_number\"]")).sendKeys(pr.getProperty("mobile"));
		driver.findElement(By.xpath("//*[@id='ap_email']")).sendKeys(pr.getProperty("email"));
		driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys(pr.getProperty("password"));
		driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
		Thread.sleep(4000);
		driver.close();
	}

}
