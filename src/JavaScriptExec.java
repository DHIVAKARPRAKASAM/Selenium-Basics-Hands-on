
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExec {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		driver.findElement(By.id("email")).sendKeys("dhivayapramil@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("9443943941");
	WebElement s1=driver.findElement(By.id("loginbutton"));

	//border(s1,driver);
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src,new File("C://Users//dhiva//eclipse-workspace//Selenium//src/element.png"));
	
	//alertpop(driver,"Hyeeee....u have bug");
	//driver.switchTo().alert().accept();
	//scroll(driver);
	WebElement createpage=driver.findElement(By.xpath("//*[@id=\"birthday-help\"]"));
	scrollView(createpage,driver);
	}
	
	
	public static void border(WebElement element,WebDriver driver) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.border='5px solid red'",element);
			}
	public static void alertpop(WebDriver driver,String message) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("alert('"+message+"')");}
	
	public static void scroll(WebDriver driver) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		}
	
	public static void scrollView(WebElement element,WebDriver driver) {
	JavascriptExecutor js=((JavascriptExecutor)driver);
	js.executeScript("arguments[0].scrollIntoView(true)",element);
	}
	
		
	}


