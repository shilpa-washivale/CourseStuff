import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ass7Webtables {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub.
		//Assignment 7 - Web Tables
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Selenium\\chromedriver\\chromedriver\\chromedriver.exe");
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver= new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 470)");
		Thread.sleep(5000);
		WebElement table=driver.findElement(By.id("product"));
		//prints the no of rows
		System.out.println(table.findElements(By.tagName("tr")).size());
		//prints ths no. of columns
		System.out.println(table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());
		
		//prints the second rows data
		List<WebElement> secondrow=table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
		System.out.println(secondrow.get(0).getText());
		System.out.println(secondrow.get(1).getText());
		System.out.println(secondrow.get(2).getText());
		
		

	}

}
