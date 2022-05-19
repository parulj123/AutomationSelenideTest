package Org.Google;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selectors.byTagName;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

public class VideoLinkTest {
	private static final SelenideElement Video_Button_Link = $(
			byAttribute("class", "StyledButton-sc-323bzc-0 lhTsoH sc-jOrMOR ieJxUb"));
	private static final SelenideElement Video_ICON = $(
			byAttribute("src", "/static/media/whitePlayMedia.014d3ff6c832c72403a72f1ebc06af72.svg"));
	private static final SelenideElement DATASET_PAGE = $(byAttribute("data-testid", "descriptive-metadata-list"));
	private static final ElementsCollection FILE_NAVIGATION_FOLDER_BREADCRUMBS = $$(byTagName("iframe"));
	private static final SelenideElement Next_Video_Enabled = $(byAttribute("aria-label", "Next Video"));
	public int count = 0;

	@Test
	public void tooltip() throws InterruptedException {
		open("https://test.metadatadev.co.uk/browser/dataset?id=131824");
		Thread.sleep(5000);
		$(By.xpath("//button[@data-testid='cookie-consent-modal-accept']")).click();
		boolean video_button = Video_Button_Link.shouldBe(visible).isDisplayed();
		System.out.println(video_button);
		Thread.sleep(2000);
		boolean dataset_page = DATASET_PAGE.shouldBe(visible).isDisplayed();
		System.out.println(dataset_page);
		boolean video_icon = Video_ICON.shouldBe(visible).isDisplayed();
		System.out.println(video_icon);
		Video_ICON.click();
		boolean Video_isEnabled = Next_Video_Enabled.should(Condition.visible, Duration.ofSeconds(50)).isEnabled();
		System.out.println(Video_isEnabled);

		while (Video_isEnabled) {
			Next_Video_Enabled.click();
			count++;
			Video_isEnabled = Next_Video_Enabled.should(Condition.visible, Duration.ofSeconds(30)).isEnabled();
		}
		if (count > 1) {
			System.out.println(count);
		}
		int count = FILE_NAVIGATION_FOLDER_BREADCRUMBS.size();

		System.out.println(count);
		Thread.sleep(2000);

	}
}
