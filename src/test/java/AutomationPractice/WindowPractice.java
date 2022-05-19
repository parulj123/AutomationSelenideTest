package AutomationPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D://chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com/"); //pause this page fully loaded ,it will to load all components
		driver.navigate().to("https://rahulshettyacademy.com/#/index");
		System.out.println("for back!!!");
		driver.navigate().back();
		Thread.sleep(5000);
		System.out.println("for forward!!!");
		driver.navigate().forward();
	}

}
