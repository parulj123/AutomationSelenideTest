package Org.Google;
import static com.codeborne.selenide.Selenide.*;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.*;

public class AuthPopUp {
	@Test
	public void authPopUp() throws InterruptedException {
		
	System.setProperty("selenide.browser","edge");
	  open("https://the-internet.herokuapp.com/basic_auth", 
			  "", "admin", "admin");
	   Thread.sleep(5000);
		String text=$(By.cssSelector("div.example")).getText();
		System.out.println(text);
		Assert.assertTrue(text.contains("Congratulations"));
	}

}
