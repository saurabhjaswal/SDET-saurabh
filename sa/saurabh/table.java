package saurabh;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class table {
	public void launch()
	{

	System.setProperty("webdriver.chrome.driver", "\\D:\\Selenium_codes\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();

	driver.navigate().to("file:///C:/Users/install/Desktop/new%201.html");
	//String str=driver.findElement(By.xpath("//table//tr//td")).getText();
	//System.out.println(str);
	ArrayList<WebElement> sa= new ArrayList<WebElement> (driver.findElements(By.xpath("//table//tr//th")));
	for(int i=0;i<sa.size();i++)
	{
		System.out.print(sa.get(i).getText());
	
		
	}
	ArrayList<WebElement> obj= new ArrayList<WebElement> (driver.findElements(By.xpath("//table//tr//td")));
	for(int i=0;i<obj.size();i++)
	{
		//System.out.println(sa.get(i).getText());
		System.out.print(obj.get(i).getText());
		
	}
			
}
	public static void main(String[]args)
	{

		table obj=new table();

		obj.launch();
		

	}

}