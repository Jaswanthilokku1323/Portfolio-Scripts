package pro3;
import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Alert;

public class Registration {

	public static void main(String[] args) {

		String path="D:\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver=new ChromeDriver();


		driver.get("file:///C:/Users/itctesting34/Downloads/Portfolio-Web_Application-Project-main/Portfolio-WebApplication/Registration%20Form/index.html");
		//first name
		driver.findElement(By.id("firstname")).sendKeys("Jaswanthi");

		//last name
		driver.findElement(By.id("lastname")).sendKeys("Lokku");

		//date of birth
		WebElement dateDob = driver.findElement(By.xpath("//input[@id=\"dob\"]"));
		dateDob.sendKeys("19032001");

		//email
		driver.findElement(By.id("email")).sendKeys("jaswanthi1323@gmail.com");

		//phone number
		driver.findElement(By.id("phonenumber")).sendKeys("9133132672");

		//gender
		Select gender = new Select(driver.findElement(By.id("gender")));
		gender.selectByVisibleText("Female");
		gender.selectByIndex(2);

		//address
		driver.findElement(By.id("address")).sendKeys("Gudur, AndhraPradesh");

		//state
		Select state = new Select(driver.findElement(By.id("state")));
		state.selectByVisibleText("AndhraPradesh");
		state.selectByIndex(1);

		//resume upload
		WebElement uploadElement = driver.findElement(By.id("resume"));
		uploadElement.sendKeys("D:\\Jaswanthi Lokku Resume.pdf");

		//registration date
		WebElement dateBox = driver.findElement(By.xpath("//input[@id=\"registrationdate\"]"));
		dateBox.sendKeys("20062022");
		dateBox.sendKeys(Keys.TAB);
		dateBox.sendKeys("0130PM");

		////password
		driver.findElement(By.id("password")).sendKeys("Jaswanthi@123");

		//confirm password
		driver.findElement(By.id("confirm-password")).sendKeys("Jaswanthi@123");

		//agree terms and condition
		driver.findElement(By.id("agree")).click();

		//register
		driver.findElement(By.id("submit-btn")).click();

		//alert
		driver.switchTo().alert().accept();
	}

} 