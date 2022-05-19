package Org.Google;

import static com.codeborne.selenide.Condition.ownText;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selectors.byCssSelector;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
public class Citable {
	private static final String PAGE_TITLE = "MDX Browser";
	private static final String PAGE_RELATIVE_URL = "/browser/dataset";
	private static final SelenideElement DATASET_PAGE_TITLE = $("title");
	private static final SelenideElement CITABLEAS_String = $(byCssSelector(".sc-iTVIwl"));
	 private static final ElementsCollection METADATA_TABS = $$(byAttribute("role", "tab"));
	  private static final SelenideElement ACCESSIBILITY_METADATA_TAB = METADATA_TABS.find(text("Accessibility"));
	private static final String CITABLE_TEXT="(2021): IPCC V1 Automated API Test Dataset. MetadataWorks, 01 July 2021. 10.1234/456-mydoc-456584893489";
	private static final SelenideElement ACCESSIBILITY_SECTION_BLOCK = $(byAttribute("data-testid", "descriptive-accessibility-block"));
    private static final SelenideElement CITABLE_AS_LABEL = ACCESSIBILITY_SECTION_BLOCK.$$("div > div > div > span").findBy(text("Citable As: "));
    private static final SelenideElement ACCESSIBILITY_CITABLE_AS_VALUE = CITABLE_AS_LABEL.parent().sibling(0);

	@Test
	public void tooltip() throws InterruptedException {
	open("https://test.metadatadev.co.uk/browser/dataset?id=543329");
	Thread.sleep(5000);
	$(By.xpath("//button[@data-testid='cookie-consent-modal-accept']")).click();

	boolean title_result = $("title").shouldHave(ownText(PAGE_TITLE)).exists();
	System.out.println(title_result);
	ACCESSIBILITY_METADATA_TAB.click();
	
	boolean accessibility = ACCESSIBILITY_CITABLE_AS_VALUE.shouldBe(visible).isDisplayed();
	System.out.println(accessibility);

	  Assert.assertEquals(CITABLE_TEXT,ACCESSIBILITY_CITABLE_AS_VALUE.shouldBe(visible).getText());
	Thread.sleep(3000);

	}

	
}


