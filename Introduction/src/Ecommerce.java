import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Ecommerce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//LEC_72 sending array of products to the cart
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Selenium\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		List<WebElement> products= driver.findElements(By.cssSelector("h4.product-name"));
		
		for(int i=0; i<products.size(); i++)
		{
			String name=products.get(i).getText();
			 
			if(name.contains("Cucumber"))
			{
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).getText();
				break;
			}
			
		}

	}

}
