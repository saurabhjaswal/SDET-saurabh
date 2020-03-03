package saurabh;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {
	public void launch() {
		System.setProperty("webdriver.chrome.driver", "\\D:\\Selenium_codes\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		//driver.findElement(By.linkText("https://www.facebook.com/recover/initiate/?ars=facebook_login")).click();
		ArrayList<WebElement> al= new ArrayList<WebElement>(driver.findElements(By.tagName("a")));
		System.out.println(al.size());
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i).getText());
			System.out.println(al.get(i).getAttribute("href"));
		}
		
}
	public static void main(String[]args)
	{
		facebook obj=new facebook();
		obj.launch();
	}
}