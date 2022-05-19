package AutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "D://chromedriver_win32/chromedriver.exe");
        
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        
        driver.manage().window().maximize(); //maximize window
        driver.findElement(By.id("name")).sendKeys("Parul");
        driver.findElement(By.cssSelector("[id='alertbtn']")).click();
        System.out.println( driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
        driver.findElement(By.id("confirmbtn")).click();
        System.out.println( driver.switchTo().alert().getText());
        driver.switchTo().alert().dismiss();
	}

}
