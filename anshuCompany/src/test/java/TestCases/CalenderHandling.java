package TestCases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalenderHandling {
	public static String month="April 2022";
	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions option=new ChromeOptions();
		option.addArguments("C:\\Users\\Mauli11\\AppData\\Local\\Google\\Chrome\\User Data\\Profile 4");
		
		WebDriver driver= new ChromeDriver(option);
		
		driver.get("https://www.goibibo.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		      driver.findElement(By.xpath("(//span[@class='sc-ieecCq gToiRQ fswDownArrow'])[1]")).click();
		      boolean monName=driver.findElement(By.xpath("//div[@class='DayPicker-Caption']")).getText().contains(month);
		     while(!monName)
		   {
			  driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
		   }
		    List<WebElement> dateclick=driver.findElements(By.xpath("//div[@class='DayPicker-Day']"));
		
	    	dateclick.size();
		   for(int i=1;i<=dateclick.size();i++)
		{
			dateclick.get(i).getText();
			System.out.println(dateclick);
			if(dateclick.equals("20"))
			{
				dateclick.get(i).click();
			}
		}
		}
		
		
	}


