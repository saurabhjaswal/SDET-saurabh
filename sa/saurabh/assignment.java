package saurabh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment {
	public void launch() {
		System.setProperty("webdriver.chrome.driver", "\\D:\\Selenium_codes\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.btes.co.in/");
		driver.findElement(By.xpath("/html/body/header[2]/div/nav/ul/li[2]/a[1]")).click();
		driver.findElement(By.xpath("/html/body/header[2]/div/nav/ul/li[2]/ul/li[6]/a")).click();
		System.out.println(driver.getTitle());
}	
	public static void main(String[]args)
	{
		assignment obj=new assignment();
		obj.launch();
	}
}
