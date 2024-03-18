import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class linkCount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Selenium\\chromedriver\\chromedriver\\chromedriver.exe");
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver= new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//count of total links on  web page
		WebElement footerLink=driver.findElement(By.id("gf-BIG"));
		System.out.println(footerLink.findElements(By.tagName("a")).size());
		
		WebElement columnLink= driver.findElement(By.xpath("//table/tbody/tr/td/ul"));
		System.out.println(columnLink.findElements(By.tagName("a")).size());
		
		//open link in new tab Hold ctrl button to open in new tab
		for(int i=1; i<columnLink.findElements(By.tagName("a")).size(); i++)
		{
			String clickonlink=Keys.chord(Keys.CONTROL, Keys.ENTER);
			columnLink.findElements(By.tagName("a")).get(i).sendKeys(clickonlink);
			Thread.sleep(4000);
		}
			Set<String> title= driver.getWindowHandles();
			Iterator<String> it=title.iterator();
			
			//it will print the title of the web page in output
			while(it.hasNext())
			{
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
				
			}
		}

	

}
