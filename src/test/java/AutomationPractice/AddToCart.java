package AutomationPractice;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D://chromedriver_win32/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		String[] VegItems= {"Cucumber" ,"Brocolli","Tomato","Brinjal"};
		int j=0;
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		driver.manage().window().maximize(); // maximize window
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		// store in a loop
		for (int i = 0; i < products.size(); i++) {

			String[] name = products.get(i).getText().split("-");
			String FormatedName = name[0].trim();
			//System.out.println(name);
			
			
			List vegItemList = Arrays.asList(VegItems);

			if (vegItemList.contains(FormatedName)) {
				
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if(j==VegItems.length) {
					break;
				}
			}
		}

	}

}
