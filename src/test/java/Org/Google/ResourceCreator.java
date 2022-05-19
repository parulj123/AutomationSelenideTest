package Org.Google;

import static com.codeborne.selenide.Condition.ownText;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byCssSelector;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.executeJavaScript;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selectors.*;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.openqa.selenium.By;

import com.codeborne.selenide.SelenideElement;

public class ResourceCreator {
	private static final String PAGE_TITLE = "MDX Browser";
	private static final String PAGE_RELATIVE_URL = "/browser/dataset";
	private static final SelenideElement DATASET_PAGE_TITLE = $("title");
	private static final SelenideElement ACCESSIBILITY_SCROLL = $(byText("Accessibility"));
	 private static final SelenideElement ACCESSIBILITY_SECTION_BLOCK = $(byAttribute("data-testid", "descriptive-accessibility-block"));
	private static final SelenideElement ACCESSIBILITY_RESOURCE_CREATOR_LABEL = ACCESSIBILITY_SECTION_BLOCK.$$("div > div > div > span").findBy(text("Resource Creator: "));
	private static final SelenideElement ACCESSIBILITY_RESOURCE_CREATOR_VALUE = ACCESSIBILITY_RESOURCE_CREATOR_LABEL.parent().sibling(0);
	@Test
	public void tooltip() throws InterruptedException {
	open("https://test.metadatadev.co.uk/browser/dataset?id=544099");
	Thread.sleep(5000);
	$(By.xpath("//button[@data-testid='cookie-consent-modal-accept']")).click();

	boolean title_result = $("title").shouldHave(ownText(PAGE_TITLE)).exists();
	System.out.println(title_result);
	executeJavaScript("arguments[0].click();", ACCESSIBILITY_SCROLL);
	String Resource_Creator_MetaData=ACCESSIBILITY_RESOURCE_CREATOR_VALUE.getText();
	boolean res123=ACCESSIBILITY_RESOURCE_CREATOR_VALUE.shouldHave(text(",")).exists();
	System.out.println(res123);
	boolean res=ACCESSIBILITY_RESOURCE_CREATOR_VALUE.shouldHave(text(Resource_Creator_MetaData)).isDisplayed();
	System.out.println(res);

	Thread.sleep(3000);
	}
}
