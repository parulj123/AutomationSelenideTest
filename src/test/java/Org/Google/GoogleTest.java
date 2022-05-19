package Org.Google;


import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.open;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;



public class GoogleTest {

	@Test
	public void Google_Serach_Test() {
		
		open("https://www.google.com/");
		$(By.name("q")).setValue("Naveen AutomationLab");
		$(By.name("btnK")).click();
		$(By.id("logo")).shouldHave(Condition.appear);
		String header=$(By.xpath("//h3[text()='Welcome to Naveen AutomationLabs - naveen automationlabs']")).getText();
		System.out.println(header);
		Assert.assertEquals(header,"Welcome to Naveen AutomationLabs - naveen automationlabs");
		int headerCount= $$(By.cssSelector(".LC20lb.MBeuO.DKV0Md")).size();

		System.out.println(headerCount);
		$$(By.cssSelector(".LC20lb.MBeuO.DKV0Md")).shouldHave(CollectionCondition.size(13));
		
	}

	
}
