package saurabh;
	import org.openqa.selenium.By;

	import org.openqa.selenium.WebDriver;

	import org.openqa.selenium.chrome.ChromeDriver;


	public class saurabh {
	public void launch()
	{

	System.setProperty("webdriver.chrome.driver", "\\D:\\Selenium_codes\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();

	driver.navigate().to("https://www.naukri.com/hr-recruiters-consultants");

	driver.findElement(By.name("qp")).sendKeys("Software Developer");


	driver.findElement(By.name("ql")).sendKeys("chandigarh");
	driver.findElement(By.id("qsbFormBtn")).click();

	}

	public static void main(String[]args)
	{

		saurabh obj=new saurabh();

		obj.launch();

	}

	}


