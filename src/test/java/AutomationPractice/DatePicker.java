package AutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class DatePicker {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D://chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://book.spicejet.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.id("marketDate_2")).getAttribute("style"));
		driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_RoundTrip")).click();
		//Date picker is enabled or not on round trip option
		
		System.out.println(driver.findElement(By.id("marketDate_2")).getAttribute("style"));
		if(driver.findElement(By.id("marketDate_2")).getAttribute("style").contains("1")) {
			System.out.println("It's enabled");
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);	
		}
		
		/*
		 * ////a[@value='MAA'] driver.findElement(By.id(
		 * "ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT"
		 * )).click(); driver.findElement(By.xpath("//a[@value='BLR']")).click();
		 * Thread.sleep(2000);
		 * //driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		 * driver.findElement(By.xpath(
		 * "//div[@id='ControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTNR']//a[@value='MAA']"
		 * )).click(); ////div[@id=
		 * "ControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTNR"
		 * ]//a[@value='MAA'] Thread.sleep(3000);
		 */
	}

}
