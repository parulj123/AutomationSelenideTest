package Org.Google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.javatpoint.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//a[@href='java-tutorial']")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='bottomnextup']//a[@class='next']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='bottomnextup']//a[@class='next']")).click();

	}

}
