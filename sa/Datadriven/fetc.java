package Datadriven;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fetc {
	String var, uname, pass;

	public void fetch() throws IOException {
		FileInputStream fs = new FileInputStream(
				"D:\\Selenium_codes\\saurabh\\sa\\Datadriven\\tstdata\\TestData.xls");
		HSSFWorkbook wb = new HSSFWorkbook(fs);
		HSSFSheet sheet = wb.getSheet("Sheet1");
		int count=sheet.getLastRowNum();
		System.out.println(count);
		HSSFRow row=sheet.getRow(0);
		int col = row.getLastCellNum()-1;
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_codes\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		for (int i = 1; i <= count; i++) {
			// HSSFRow row=sheet.getRow(i);
			for (int j = 0; j < col; j++) {
// HSSFCell cell=	row.getCell(j);
//	System.out.println(cell);
				driver.navigate().to("https://www.facebook.com/");
				//uname = sheet.getRow(i).getCell(j).toString();
				//pass = sheet.getRow(i).getCell(j + 1).toString();
				driver.findElement(By.cssSelector(".inputtext _55r1 _6luy")).sendKeys("admin");
//				driver.findElement(By.name("email")).clear();
//				driver.findElement(By.name("email")).sendKeys(uname);
//				driver.findElement(By.name("pass")).clear();
//				driver.findElement(By.name("pass")).sendKeys(pass);
//				driver.findElement(By.id("u_0_b")).click();
//				driver.navigate().back();
			}

			// driver.findElement(arg0)
		}

//HSSFRow row=sheet.getRow(1);
//HSSFCell cell=row.getCell(0);
//System.out.println(cell);
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		fetc ko = new fetc();
		ko.fetch();
	}

}
