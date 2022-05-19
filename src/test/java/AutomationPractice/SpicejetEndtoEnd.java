package AutomationPractice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class SpicejetEndtoEnd {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D://chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://book.spicejet.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_OneWay")).click();
		driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT"))
				.click();
		driver.findElement(By.xpath("//a[@value='DEL']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath(
				"//div[@id='ControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTNR']//a[@value='MAA']"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[@class='ui-datepicker-days-cell-over  ui-datepicker-current-day ui-datepicker-today'] /a")).click();
		System.out.println(driver.findElement(By.id("marketDate_2")).getAttribute("style"));
		if (driver.findElement(By.id("marketDate_2")).getAttribute("style").contains("0.5")) {
			System.out.println("It's disabled");
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
		Thread.sleep(2000);
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);
		WebElement staticdropdown = driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_ADT"));
		Select dropdown = new Select(staticdropdown);
		dropdown.selectByValue("5");
		Assert.assertEquals(dropdown.getFirstSelectedOption().getText(), "5");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		driver.findElement(By.id("divpaxinfo")).click();
		driver.findElement(By.name("ControlGroupSearchView$AvailabilitySearchInputSearchView$ButtonSubmit")).click();
		driver.quit();
	}

}
