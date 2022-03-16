package TestCases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalenderHa2 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions option=new ChromeOptions();
		option.addArguments("C:\\Users\\Mauli11\\AppData\\Local\\Google\\Chrome\\User Data\\Profile 4");
		
		WebDriver driver= new ChromeDriver(option);
		
		driver.get("https://www.goibibo.com/flights/?utm_source=google&utm_medium=cpc&utm_campaign=DF-Brand-EM&utm_adgroup=Only%20Goibibo&utm_term=!SEM!DF!G!Brand!ETA!108599293!6504095653!491619965162!e!goibibo!c!&gclid=CjwKCAiAvOeQBhBkEiwAxutUVDYcNh7NwU4FXVp8nhYZJODM3SU5IsqrtoiBG82BxVj9uCOWF0lJeRoC9yQQAvD_BwE");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
			driver.findElement(By.xpath("//input[@id='departureCalendar']")).click();
			 while(!driver.findElement(By.xpath("//div[@class='DayPicker-Caption']")).getText().contains("April 2022"))
			   {
				  driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
			   }
			
			    List<WebElement> dateclick=driver.findElements(By.xpath("//div/div[@class='DayPicker-Day']"));
			
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
