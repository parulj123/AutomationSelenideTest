package Org.Google;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.actions;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selectors.byAttribute;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.codeborne.selenide.SelenideElement;

public class MetaData {
	
	
	private static final SelenideElement PUBLISHER_FILTER =$(byText("Publisher Name"));
    private static final SelenideElement PUBLISHER_FILTER_CHECKBOX =$(byText("Publisher"));
    private static final SelenideElement PUBLISHER_TOOLTIP =$(byAttribute("data-tip","Publisher"));
	   
	@Test
	public void tooltip() throws InterruptedException {
		open("https://test.metadatadev.co.uk/browser/search");
		Thread.sleep(5000);
		$(By.xpath("//button[@data-testid='cookie-consent-modal-accept']")).click();
		
		//Start
		Thread.sleep(3000);
		PUBLISHER_FILTER.click();
		Thread.sleep(3000);
		String Expexctedtext=PUBLISHER_FILTER_CHECKBOX.getText();
		System.out.println("Fiter Item is Displayed-->" +Expexctedtext);
		//actions().moveToElement(PUBLISHER_FILTER_CHECKBOX).perform();
		PUBLISHER_FILTER_CHECKBOX.hover();
		boolean result=PUBLISHER_TOOLTIP.isDisplayed();
		System.out.println(result);
		String publishertext=PUBLISHER_TOOLTIP.getText();
		System.out.println("toolTipText-->" +publishertext);
		Assert.assertEquals(Expexctedtext, publishertext);
		Thread.sleep(5000);
	}
	
}
