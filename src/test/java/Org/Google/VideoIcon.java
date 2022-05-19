package Org.Google;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.conditions.Enabled;

public class VideoIcon {

	private static final SelenideElement DATASET_VIDEO_LINK = $(
			byAttribute("src", "/static/media/whitePlayMedia.014d3ff6.svg"));
	private static final SelenideElement DATA_ELEMENT_DATASET_SCREEN = $(
			byAttribute("data-testid", "descriptive-metadata-list"));
	private static final SelenideElement Video_Button_Link = $(byAttribute("alt", "Associated Videos"));
	private static final SelenideElement PREVIOUS_VIDEO_ARROW = $(byAttribute("aria-label", "Previous Video"));
	private static final SelenideElement NEXT_VIDEO_ARROW = $(byAttribute("aria-label", "Previous Video"));

	@Test
	public void tooltip() throws InterruptedException {
		open("https://test-browser-api.metadatadev.co.uk/browser/dataset?id=131824");
		Thread.sleep(3000);
		$(By.xpath("//button[@data-testid='cookie-consent-modal-accept']")).click();
		boolean video_res = Video_Button_Link.shouldBe(visible).isDisplayed();
		System.out.println(video_res);
		boolean dataset_screen = DATA_ELEMENT_DATASET_SCREEN.shouldBe(visible).exists();
		System.out.println(dataset_screen);
		Video_Button_Link.should(Condition.visible, Duration.ofSeconds(3000)).click();
		PREVIOUS_VIDEO_ARROW.shouldBe(visible ).isDisplayed();
		NEXT_VIDEO_ARROW.shouldBe(visible ).isDisplayed();
		boolean Video_isDisabled=!PREVIOUS_VIDEO_ARROW.shouldBe(visible ).isEnabled();
		System.out.println(Video_isDisabled);

		Thread.sleep(3000);
	}
}
