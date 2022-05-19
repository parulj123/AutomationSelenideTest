package AutomationPractice;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		String[] VegItems = { "Cucumber", "Brocolli", "Tomato", "Brinjal" };

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(3000);
		addItems(driver, VegItems);
		
		WebDriverWait w= new WebDriverWait(driver, Duration.ofSeconds(5));
		//WebDriverWait wait = new WebDriverWait(driver,5);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		//explicit Wait
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		//explicit Wait
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());

	}

	public static void addItems(WebDriver driver, String[] VegItems) throws InterruptedException {
		int j = 0;
		driver.manage().window().maximize(); // maximize window
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		Thread.sleep(2000);
		
		driver.manage().window().minimize();
		// store in a loop
		for (int i = 0; i < products.size(); i++) {

			String[] name = products.get(i).getText().split("-");
			String FormatedName = name[0].trim();
			// System.out.println(name);

			List vegItemList = Arrays.asList(VegItems);

			if (vegItemList.contains(FormatedName)) {

				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if (j == VegItems.length) {
					break;
				}
			}
		}

	}
}
