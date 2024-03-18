import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class windowHandleass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//assignment 4 section 10
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Selenium\\chromedriver\\chromedriver\\chromedriver.exe");
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver= new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.cssSelector("a[href='/windows']")).click();
		driver.findElement(By.cssSelector("a[href='/windows/new']")).click();
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> it= windows.iterator();
		String parentID = it.next();
		String childID = it.next();
		driver.switchTo().window(childID);
		System.out.println(driver.findElement(By.xpath("//div/h3")).getText());
	   System.out.println(driver.switchTo().window(parentID).findElement(By.cssSelector("div[class='example'] h3")).getText());

	}

}
