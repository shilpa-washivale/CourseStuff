import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/login.php/");
		driver.findElement(By.id("email")).sendKeys("Shilpa Washivale");
		driver.findElement(By.name("pass")).sendKeys("12345");
		driver.findElement(By.id("loginbutton")).click();
		System.out.println(driver.findElement(By.cssSelector("div._9ay7")).getText());

	}

}
