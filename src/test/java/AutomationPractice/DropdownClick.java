package AutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class DropdownClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://book.spicejet.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		// Check box is selected or not
		Assert.assertFalse(driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_SeniorCitizen"))
				.isSelected());
		//System.out.println(driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_SeniorCitizen")).isSelected());
		driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_SeniorCitizen")).click();
		Assert.assertTrue(driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_SeniorCitizen"))
				.isSelected());
		System.out.println(
				driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_SeniorCitizen"))
						.isSelected());

		// Count the number of checkbox
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);
		/*
		 * int i=1; while(i<5) { driver.findElement(By.id("hrefIncAdt")).click(); i++; }
		 */
		/*
		 * for (int i = 1; i < 5; i++) {
		 * driver.findElement(By.id("hrefIncAdt")).click();
		 * 
		 * }
		 */
		// driver.findElement(By.id("divpaxinfo")).click();
		// Thread.sleep(2000L);
		driver.manage().window().maximize();
		driver.findElement(
				By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_ADT"))
				.click();
		Thread.sleep(2000L);
		WebElement staticdropdown = driver.findElement(
				By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_ADT"));

		Select dropdown = new Select(staticdropdown);
		dropdown.selectByValue("5");
		Assert.assertEquals(dropdown.getFirstSelectedOption().getText(), "5");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		driver.findElement(By.id("divpaxinfo")).click();

		// driver.findElement(By.id("btnclosepaxoption")).click();
		// driver.findElement(By.id("divpaxinfo")).getText();
	}
}
