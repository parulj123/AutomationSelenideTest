package Org.Google;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;

public class LaunchBrowser {

	@Test
	public void launchBrowserTest() {

		// System.setProperty("","");
		Configuration.browser = "chrome";
		Configuration.headless = false;
		Configuration.baseUrl = "https:0.//www.google.com/";
		// Configuration.browserBinary="E://Parul//chromedriver_win32//chromedriver.exe";
		Configuration.browserSize = "1920x1080";
		
		//System.setProperty("selenide.browser", "E:\\Parul\\chromedriver_win32");
		open("/");
		$(By.name("q")).setValue("Naveen AutomationLab");
		$(By.name("btnK")).click();
		$(By.id("logo")).shouldHave(Condition.appear);
		String header = $(By.xpath("//h3[text()='Welcome to Naveen AutomationLabs - naveen automationlabs']"))
				.getText();
		System.out.println(header);
		Assert.assertEquals(header, "Welcome to Naveen AutomationLabs - naveen automationlabs");
	}
}
