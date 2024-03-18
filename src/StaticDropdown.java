import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Lecture 52
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement staticdropdown= driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		//This code is only for Static dropdown when there is 'Select' tagname available
		Select dropdown= new Select(staticdropdown);
		
		dropdown.selectByIndex(2);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByVisibleText("USD");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByValue("INR");
		System.out.println(dropdown.getFirstSelectedOption().getText());

	}

}
