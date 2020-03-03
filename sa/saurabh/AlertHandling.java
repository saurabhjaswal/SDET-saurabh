package saurabh;



	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	public class AlertHandling {
		String path;
		public void launch() throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "\\D:\\Selenium_codes\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
			driver.findElement(By.name("proceed")).click();
			driver.manage().window().maximize();
			
			Alert alt= driver.switchTo().alert();
			Thread.sleep(5000);
			System.out.println(alt.getText());
			alt.accept();
			
		}
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			AlertHandling oo= new AlertHandling();
			oo.launch();
		}

	}


