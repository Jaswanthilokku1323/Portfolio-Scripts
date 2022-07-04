package pro3;

import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
public class login {
	public static void main(String[] args) {
		 String path="D:\\\\chromedriver.exe";
	       System.setProperty("webdriver.chrome.driver", path);
	       WebDriver driver=new ChromeDriver();
	       
	       driver.get("file:///C:/Users/itctesting34/Downloads/Portfolio-Web_Application-Project-main/Portfolio-WebApplication/index.html");
	       //username
	       driver.findElement(By.id("phone-email")).sendKeys("jaswanthi");
	       //password
	       driver.findElement(By.id("password")).sendKeys("Jmrlmd@6");
	       //login button
	       driver.findElement(By.id("submittion")).click();
		}
}
