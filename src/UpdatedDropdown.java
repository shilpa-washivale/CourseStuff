import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Admin\\\\Desktop\\\\Selenium\\\\chromedriver\\\\chromedriver\\\\chromedriver.exe");
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");
		//to add command use Ctrl+Shift+ /
		//Get the size of Checkboxes on the page
		
		//driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).isSelected();
		//driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).click();
		//driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).isSelected();
		
		//Importance of Assertion in Automation- It validates the actual and expcted result.
		
		Assert.assertFalse(driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).isSelected());
		driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).click();
		Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).isSelected());
		Assert.assertEquals(driver.findElements(By.cssSelector("input[type='checkbox']")).size(), 6);
		
		//System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size()); //size() - returns the no. of checkboxes present on the page
		//Auto Suggestive dropdown #1
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(2000);
		List<WebElement> optionn=driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		for(WebElement option :optionn)
		{
			Thread.sleep(2000);
			
			if(option.getText().equalsIgnoreCase("India"))
			{		
				option.click();
				//option.click();
				break;
			}
		}
		
		//Radiobutton
		
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		//dropdown #2
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		driver.findElement(By.xpath("//a[@value=\"AMD\"]")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("(//a[@value=\"GAU\"])[2]")).click(); XPATH
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='GAU']")).click(); //parent-child
		
	//	driver.findElement(By.id("divpaxinfo")).click();
		//System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		//Calendar UI
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		driver.findElement(By.id("ctl00_mainContent_view_date2")).click();
		Thread.sleep(1000);
		//driver.findElement(By.id("ctl00_mainContent_view_date2")).getAttribute("style").contains("1");
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
		
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(1000);
		int i=1;
		while(i<5)
		{
			driver.findElement(By.id("hrefIncAdt")).click(); //using WHILE loop
			i++;
		}
		
		/*for(int i=1; i<5; i++)
		{
			driver.findElement(By.xpath("span[id='hrefIncAdt']")).click(); //using FOR loop
			
		}*/
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	
		driver.findElement(By.cssSelector("input[type='submit']")).click();
	}

}
