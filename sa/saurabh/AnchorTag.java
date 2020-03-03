package saurabh;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AnchorTag { 
	String path;
	public void demo() {
		System.setProperty("webdriver.chrome.driver", "\\D:\\Selenium_codes\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.bbc.com/");
		ArrayList <WebElement> al= new ArrayList<WebElement> (driver.findElements(By.tagName("img")));
		//ArrayList <WebElement> ak= new ArrayList<WebElement> (driver.findElements(By.tagName("a")));
		System.out.println(al.size());
		
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i).getAttribute("src"));
		}
		//for(int i=0;i<ak.size();i++) {
			//System.out.println(ak.get(i).getText());
		//}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnchorTag aa= new AnchorTag();
		aa.demo();
	}

}



