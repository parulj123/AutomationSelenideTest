package Org.Google;

import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.open;
public class NavigationConcept {
	
	@Test
	public void navigateTest() throws InterruptedException {
		
		open("https://www.google.com/");
		System.out.println(title());
		
		//open amazon url
		open("https://www.amazon.com/");
		System.out.println(title());
		
		back();
		System.out.println(title());
		
		forward();
		System.out.println(title());
		
		back();
		System.out.println(title());
		
		Thread.sleep(2000);
		
		refresh();
		
	}

}
