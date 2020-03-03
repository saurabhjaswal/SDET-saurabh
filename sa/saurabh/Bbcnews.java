package saurabh;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bbcnews {
	
	public void launch() {
		System.setProperty("webdriver.chrome.driver", "\\D:\\Selenium_codes\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.bbc.com/");
		ArrayList <WebElement> ag= new ArrayList<WebElement> (driver.findElements(By.className("media__link")));
		for(int i=0;i<ag.size();i++)
		{
			System.out.println(ag.get(i). getText());
		}
	}
 public static void main(String[]arg) {
	 Bbcnews obj=new Bbcnews();
	 obj.launch();
 }
}