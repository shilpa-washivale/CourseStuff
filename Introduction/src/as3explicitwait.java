import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class as3explicitwait {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Selenium\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//Username
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		//Password
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("learning");
		driver.findElement(By.xpath("(//span[@class='checkmark']) [2]")).click();
		WebDriverWait w= new WebDriverWait(driver, Duration.ofSeconds(5));
		//Thread.sleep(10000);
		//driver.switchTo().alert().accept();
		//driver.findElement(By.xpath("//button[@id='okayBtn']")).click();
		//Alert alert = driver.switchTo().alert();
		//alert.accept();
		//Thread.sleep(5);
		//Alert alert = w.until(ExpectedConditions.alertIsPresent());
		//alert.accept();
		driver.findElement(By.xpath("//button[@id='okayBtn']")).click();

		
	}

}
