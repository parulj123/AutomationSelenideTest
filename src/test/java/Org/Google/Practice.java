package Org.Google;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class Practice {

	public static void main(String args[]) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		driver.findElement(By.id("ap_email")).sendKeys("8791497529");
		driver.findElement(By.id("continue")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("ap_password")).sendKeys("Sonukr@183");
		driver.findElement(By.id("signInSubmit")).click();
		driver.findElement(By.id("searchDropdownBox")).click();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("boat wireless earphones");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[3]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a")).click();
	
		WebElement element = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();

		// Javascript executor

		driver.findElement(By.name("proceedToRetailCheckout")).click();

	}

}
