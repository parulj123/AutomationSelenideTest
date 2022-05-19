package Org.Google;

import static com.codeborne.selenide.Condition.ownText;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.executeJavaScript;
import static com.codeborne.selenide.Selenide.open;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.url;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CitableTest {

	private static final String PAGE_TITLE = "MDX Browser";
	private static final String PAGE_RELATIVE_URL = "/browser/dataset";
	private static final SelenideElement DATASET_PAGE_TITLE = $("title");
	private static final SelenideElement ACCESSIBILITY_SCROLL = $(byText("Accessibility"));
	private static final ElementsCollection METADATA_TABS = $$(byAttribute("role", "tab"));
	private static final SelenideElement ACCESSIBILITY_METADATA_TAB = METADATA_TABS.find(text("Accessibility"));
	private static final SelenideElement ACCESSIBILITY_SECTION_BLOCK = $(
			byAttribute("data-testid", "descriptive-accessibility-block"));
	private static final SelenideElement CITABLE_AS_LABEL = ACCESSIBILITY_SECTION_BLOCK.$$("div > div > div > span")
			.findBy(text("Citable As: "));
	private static final SelenideElement CITABLE_AS_LABEL_VALUE = CITABLE_AS_LABEL.parent().sibling(0);

	@Test
	public void tooltip() throws InterruptedException {
		open("https://test.metadatadev.co.uk/browser/dataset?id=544099");
		Thread.sleep(5000);
		$(By.xpath("//button[@data-testid='cookie-consent-modal-accept']")).click();

		boolean title_result = $("title").shouldHave(ownText(PAGE_TITLE)).exists();
		System.out.println(title_result);
		executeJavaScript("arguments[0].click();", ACCESSIBILITY_SCROLL);
	
		boolean res123 = CITABLE_AS_LABEL.shouldBe(visible).isDisplayed();
		String Resource_Creator_MetaData = CITABLE_AS_LABEL_VALUE.getText();
		System.out.println(res123);
		boolean res = CITABLE_AS_LABEL_VALUE.shouldHave(text(Resource_Creator_MetaData)).isDisplayed();
		System.out.println(res);

		Thread.sleep(3000);
	}
}
