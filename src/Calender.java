import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		  Robot robot = new Robot();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.findElement(By.xpath("//*[@id=\"origin\"]/span/input")).sendKeys("MAS");
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"destination\"]/span/input")).sendKeys("CHSM");
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(3000);	
		driver.findElement(By.xpath("//button[@class='ui-datepicker-trigger ui-calendar-button ng-tns-c14-5 ui-button ui-widget ui-state-default ui-corner-all ui-button-icon-only ng-star-inserted']")).click();
		
		
		String date1="11-August-2018";
		String datearr[]=date1.split("-");
		String date=datearr[0];
		String month=datearr[1];
		String year=datearr[2];
		String monyr=month+year;
		System.out.println(monyr);
		System.out.println(date);
		boolean flag=false;
try {
		for(int i=0;i<=12;i++) {
			String s1=driver.findElement(By.xpath("//span[@class='ui-datepicker-month ng-tns-c14-5 ng-star-inserted']")).getText();
			String s2=driver.findElement(By.xpath("//span[@class='ui-datepicker-year ng-tns-c14-5 ng-star-inserted']")).getText();
			String s3=s1+s2;
			if(s3.contentEquals(monyr)) {
				String beforeXpath="//*[@id='divMain']/div/app-main-page/div[2]/div/div[1]/div/div/div[1]/div/app-jp-input/div[3]/form/div[3]/p-calendar/span/div/table/tbody/tr[";
				String interxpath="]/td[";
				String afterxpath="]/a";
			for(int j=1;j<=7;j++)
			{
				for(int k=1;k<=7;k++)
				{
				String presentdate=driver.findElement(By.xpath(beforeXpath+j+interxpath+k+afterxpath)).getText();
						if(date.equals(presentdate))
							{
							driver.findElement(By.xpath(beforeXpath+j+interxpath+k+afterxpath)).click();								break;
								}
					
							}
							}	
		
			}
			else {
				driver.findElement(By.xpath("//a[@class='ui-datepicker-next ui-corner-all']")).click();
			}
			}}
catch(Exception e)
{
	
}

driver.findElement(By.xpath("//button[@class='search_btn']")).click();}}
			
			
	
