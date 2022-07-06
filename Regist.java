package TestNgdemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Regist {
	WebDriver driver;
  @Test
  public void test() throws InterruptedException {
	  String path1="D:\\\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path1);
	 driver=new ChromeDriver();
	 driver.get("file:///C:/Users/itctesting34/Downloads/Portfolio-Web_Application-Project-main/Portfolio-WebApplication/Registration%20Form/Login%20Form/Registration%20Form/index.html");
	 String org="Portfolio Launches Registration page! ";
		String actual=driver.getTitle();
		driver.findElement(By.id("firstname")).sendKeys("Jaswanthi");
		driver.findElement(By.id("lastname")).sendKeys("Lokku");
		WebElement dateDob = driver.findElement(By.xpath("//input[@id=\"dob\"]"));
		dateDob.sendKeys("20062022");
		driver.findElement(By.id("email")).sendKeys("jaswanthi1323@gmail.com");
		driver.findElement(By.id("phone number")).sendKeys("9133132672");
		Select gender = new Select(driver.findElement(By.id("gender")));
		gender.selectByVisibleText("Female");
		gender.selectByIndex(2);
		driver.findElement(By.id("address")).sendKeys("gudur");
		Select state = new Select(driver.findElement(By.id("state")));
		state.selectByVisibleText("Andhra Pradesh");
		state.selectByIndex(11);
		WebElement uploadElement = driver.findElement(By.id("resume"));
		uploadElement.sendKeys("D:\\Jaswanthi_resume.pdf");
		WebElement dateBox = driver.findElement(By.xpath("//input[@id=\"registrationdate\"]"));
		dateBox.sendKeys("20062022");
		dateBox.sendKeys(Keys.TAB);
		dateBox.sendKeys("0130PM");
		driver.findElement(By.id("password")).sendKeys("Jaswanthii@123");
		driver.findElement(By.id("confirm password")).sendKeys("Jaswanthi@123");
		Thread.sleep(500);
		
	 Assert.assertEquals(org,actual);
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Application starting");
	  
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}




