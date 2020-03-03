package saurabh;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardFunctioning {
	String path;
	public void demo() {
		System.setProperty("webdriver.chrome.driver", "\\D:\\Selenium_codes\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	
	driver.navigate().to("https://www.google.com");
	driver.manage().window().maximize();
	driver.findElement(By.name("q")).sendKeys("input devices");
	driver.findElement(By.className("gNO89b")).sendKeys("Keys.ENTER");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KeyboardFunctioning oo= new KeyboardFunctioning();
		oo.demo();
	}

}


