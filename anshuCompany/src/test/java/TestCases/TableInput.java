package TestCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TableInput
{
	
	public static void main(String[] args) throws Exception 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://datatables.net/examples/advanced_init/dt_events.html");
		driver.manage().window().maximize();
		int nextPage=driver.findElements(By.xpath("//div[@id='example_paginate']/span/a")).size();
		System.out.println(nextPage);
		for(int i=1; i<=nextPage;i++)
		{
			String xp= "//div[@id='example_paginate']/span/a["+i+"]";
			 driver.findElement(By.xpath(xp)).click();
			 Thread.sleep(3000);
			  
			 List<WebElement> cloSize=driver.findElements(By.xpath("//table[@id='example']/tbody/tr/td[1]"));
			 for(WebElement cSize:cloSize)
			 {
				 System.out.println(cSize.getText());
				 
			 }
			
			
		}
		
		//List<WebElement> nextPage=driver.findElements(By.xpath("//div[@id='example_paginate']/span/a[6]"))
		
		
		
		
		
	}
	
}
