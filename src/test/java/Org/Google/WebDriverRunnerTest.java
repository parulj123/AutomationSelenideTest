package Org.Google;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.codeborne.selenide.WebDriverRunner;

import static com.codeborne.selenide.Selenide.*;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;
public class WebDriverRunnerTest {
	
	@Test
	public void testRunner() {
		open("https://opensource-demo.orangehrmlive.com/");
		
		WebDriverRunner.clearBrowserCache();
		WebDriverRunner.url();
		System.out.println(WebDriverRunner.url());
		Assert.assertTrue(WebDriverRunner.url().contains("orangehrmlive"));
		//WebDriverRunner.source();
		//System.out.println(WebDriverRunner.source());
		
		WebDriverRunner.getWebDriver().manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		System.out.println(WebDriverRunner.isChrome());
		//WebDriverRunner.clo
		if(WebDriverRunner.isChrome()) {
			System.out.println("Yes, It's a Chrome");
		}
		WebDriverRunner.getAndCheckWebDriver();
		System.out.println(WebDriverRunner.supportsJavascript());
		
		List<File> weblist= WebDriverRunner.getBrowserDownloadsFolder().files();
		
		System.out.println(weblist.size());
		
		
	}
}
