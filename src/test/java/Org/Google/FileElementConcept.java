package Org.Google;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.open;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
public class FileElementConcept {
	@Test
	public void fileElement() {
		
		open("https://www.amazon.com/");
		ElementsCollection colls=$$(By.tagName("a"));
		System.out.println(colls.size());
		
		for(SelenideElement e: colls) {
			String text=e.getText();
			String href=e.getAttribute("href");
			System.out.println(text + "------"+ href);
		}
	}
}
