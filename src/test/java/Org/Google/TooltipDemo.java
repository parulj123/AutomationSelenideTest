package Org.Google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TooltipDemo {

	public static WebDriver driver; 
	
	public static void main(String[] args) { 
	
	//Set system properties for geckodriver This is required since Selenium 3.0 
	System.setProperty("webdriver.chrome.driver", "E://Parul/chromedriver.exe"); 
	
	// Create a new instance of the Firefox driver 
	driver = new ChromeDriver(); 
	
	//CASE 2 : Using Actions class method 
	driver.get("https://demoqa.com/tool-tips"); 
	
	System.out.println("demoqa webpage Displayed"); 
	
	//Maximise browser window 
	driver.manage().window().maximize(); 
	
	//Instantiate Action Class 
	Actions actions = new Actions(driver); 
	
	//Retrieve WebElement 
	WebElement element = driver.findElement(By.id("toolTipButton")); 
	
	// Use action class to mouse hover 
	actions.moveToElement(element).perform(); 
	
	WebElement toolTip = driver.findElement(By.cssSelector(".tooltiptext")); 
	
	// To get the tool tip text and assert 
	String toolTipText = toolTip.getText();
	System.out.println("toolTipText-->"+toolTipText); 
	
	//Verification if tooltip text is matching expected value 
	if(toolTipText.equalsIgnoreCase("We ask for your age only for statistical purposes.")){ 
		System.out.println("Pass* : Tooltip matching expected value");
	}else{
		System.out.println("Fail : Tooltip NOT matching expected value"); 
	} 
	
	// Close the main window 
	driver.close();
} 
}
