package Org.Google;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.switchTo;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
public class Iframe {
	@Test
	public void handleIFrame() throws InterruptedException {
		
		open("https://allwebco-templates.com/support/S_script_IFrame.htm");
		Thread.sleep(5000);
		switchTo().frame($(By.xpath("//iframe[@name='Framename' and @class='framesample framesample2']")));
		Thread.sleep(5000);
		$(By.xpath("//img[@alt='Search'][1]")).click();
		$(By.cssSelector("#searchpop > form > table > tbody > tr > td:nth-child(1) > input.stterms")).sendKeys("testing");
		$(By.name("submitbutton")).click();
		
		switchTo().defaultContent();
	}
}
