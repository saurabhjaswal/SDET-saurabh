package TestNG;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestDemo {
@Test
public void testdemo()
{
	System.out.println("testdemo");
	
}@BeforeClass
public void bef() {
	System.out.println("before class");
}
@AfterClass
public void aft() {
	System.out.println("after class");
	
}
@BeforeMethod
public void befMethod() {
	System.out.println("before method");
}
@AfterMethod
public void aftMethod() {
	System.out.println("after method");
}
@Test
public void testdemo1()
{
	System.out.println("testdemo1");
	
}

}
