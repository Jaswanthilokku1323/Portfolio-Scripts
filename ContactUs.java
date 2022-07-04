package pro3;
import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class ContactUs {

	public static void main(String[] args) {
		/*System.setProperty("webdriver.chrome.driver","C:\\Users\\itctesting27\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://selenium.dev");
		driver.close();*/

		String path="D:\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/itctesting34/Downloads/Portfolio-Web_Application-Project-main/Portfolio-WebApplication/Home%20Page/Jaswanthi-portfolio/contact.html");
		driver.findElement(By.id("name")).sendKeys("jaswanthi");
		driver.findElement(By.id("email")).sendKeys("jaswanthi1323@gmail.com");
		driver.findElement(By.id("subject")).sendKeys("Your profile is shortlisted");
		driver.findElement(By.id("message")).sendKeys("I'am quite impressed with your portfolio. May I have your resume and contact details");
		driver.findElement(By.id("submit")).click();
		//alert
		driver.switchTo().alert().accept();
	}

} 

