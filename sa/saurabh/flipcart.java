package saurabh;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipcart {
	public void launch() {
		System.setProperty("webdriver.chrome.driver", "\\D:\\Selenium_codes\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("Mobiles");
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/button")).click();
		/*ArrayList <WebElement> ag= new ArrayList<WebElement> (driver.findElements(By.className("media__link")));
		for(int i=0;i<ag.size();i++)
		{
			System.out.println(ag.get(i). getText());
		}*/
	}
 public static void main(String[]arg)
 {
	 flipcart obj=new flipcart();
	 obj.launch();
 }
}

