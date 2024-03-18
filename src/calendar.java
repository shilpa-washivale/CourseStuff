import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class calendar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//98-99-100
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Selenium\\chromedriver\\chromedriver\\chromedriver.exe");
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver= new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.path2usa.com/travel-companion/");
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(5000);
		driver.findElement(By.id("form-field-travel_comp_date")).click();
		List<WebElement> dates=driver.findElements(By.className("flatpickr-day "));
		int count=driver.findElements(By.className("flatpickr-day ")).size();
		for (int i=0; i<count; i++)
		{
			String text=driver.findElements(By.className("flatpickr-day ")).get(i).getText();
		    if(text.equalsIgnoreCase("23"))
		    {
		    	driver.findElements(By.className("flatpickr-day ")).get(i).click();
			    break;
			    }
		    }
		}

}
