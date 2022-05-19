package Org.Google;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

import java.util.Random;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.codeborne.selenide.SelenideElement;

public class VideoNavigate {
    private static final SelenideElement Video_Button_LINK = $(byAttribute("alt", "Associated Videos"));
    private static final SelenideElement VIDEO_OVERLAY_POPUP = $(byAttribute("data-testid", "youtube-video-player"));
    private static final SelenideElement PREVIOUS_VIDEO_BUTTON = $(byAttribute("aria-label", "Previous Video"));
    private static final SelenideElement NEXT_VIDEO_BUTTON = $(byAttribute("aria-label", "Next Video"));
    private static final SelenideElement FIRST_VIDEO_MEDIA =VIDEO_OVERLAY_POPUP.$(byId("Kie3HY8y6AU"));

	@Test
	public void navigateVideo() throws InterruptedException {
		open("https://test-browser-api.metadatadev.co.uk/browser/dataset?id=131824");
		Thread.sleep(5000);
		$(By.xpath("//button[@data-testid='cookie-consent-modal-accept']")).click();
		Thread.sleep(2000);
		Video_Button_LINK.shouldBe(visible).click();
		Thread.sleep(1000);
		boolean overlay_present=VIDEO_OVERLAY_POPUP.shouldBe(visible).exists();
		System.out.println(overlay_present);
		boolean video_ispresent=FIRST_VIDEO_MEDIA.shouldBe(visible).exists();
		System.out.println(video_ispresent);
		Thread.sleep(1000);
		Random r = new Random();		
		NEXT_VIDEO_BUTTON.shouldBe(visible).click();
		NEXT_VIDEO_BUTTON.shouldBe(visible).click();
		Thread.sleep(2000);
		boolean Video_isDisabled=NEXT_VIDEO_BUTTON.shouldBe(visible).isEnabled();
		System.out.println(Video_isDisabled);
		
	}
}
