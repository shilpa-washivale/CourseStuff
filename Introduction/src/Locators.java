import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;



public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Selenium\\chromedriver114\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));//implycit wait
		String password=getPassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
	//driver.findElement(By.id("inputUsername")).sendKeys("Shilpa"); //using id -locator
	//driver.findElement(By.name("inputPassword")).sendKeys("Shilpa123"); //locator- using name
	//driver.findElement(By.className("submit")).click(); //locator- using class name
		//System.out.println(driver.findElement(By.cssSelector("p.error")).getText()); //locator using cssselector
	//driver.findElement(By.linkText("Forgot your password?")).click();// locator - using LINK text
	//driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Jenny"); //Locator using xpath
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("jenny@gmail.com"); //Locator - using xpath-index
		//driver.findElement(By.cssSelector("input[placeholder='Email']")).clear(); //locator-css selector
	//driver.findElement(By.cssSelector("input[placeholder='Phone Number']")).sendKeys("5465131");
	//driver.findElement(By.className("reset-pwd-btn")).click();
	//System.out.println(driver.findElement(By.cssSelector(".infoMsg")).getText());
	//driver.findElement(By.className("go-to-login-btn")).click();
	//Thread.sleep(2000);
	//driver.findElement(By.id("inputUsername")).sendKeys("Jenny");
	//driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("jenny@gmail.com");
	//driver.findElement(By.name("inputPassword")).sendKeys(password);
		//driver.findElement(By.className("signInBtn")).click();
	//Thread.sleep(100);
	//driver.findElement(By.className("signInBtn")).click();
	//Thread.sleep(2000);
	    //Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in."); //assert to check get text is matching with output.
		//Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		//Assert.assertEquals(driver.findElement(By.cssSelector("//*[@id=\'root\']/div/div/div/p")).getText(), "You are successfully logged in.");
		//driver.quit();
	//driver.findElement(By.xpath("//button[text()=\"Log Out\"]")).click();
		
		
	}
	public static String getPassword(WebDriver driver) throws InterruptedException
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/form/div[2]/a")).click(); 
			//	linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()=\'Reset Login\']")).click();
		Thread.sleep(3000);
		String passwordText=driver.findElement(By.className("infoMsg")).getText();
		String[] passwordArray=passwordText.split("'");
		String password=passwordArray[1].split("'")[0];
		return password;
		
		//Please use temporary password 'rahulshettyacademy' to Login.
		//arr[0] - Please use temporary password
		//arr1[] - rahulshettyacademy' to Login.
		
		
		
	}
	
	

}
