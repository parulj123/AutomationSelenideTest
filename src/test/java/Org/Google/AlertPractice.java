package Org.Google;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.switchTo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertPractice {
	@Test
	public void alertSendData() throws InterruptedException {
		
		open("https://the-internet.herokuapp.com/javascript_alerts");
		
		//Javascript 
		$(By.xpath("//ul/li/button[1]")).click();
		Thread.sleep(5000);
		Alert alert=switchTo().alert();
		
		String text=alert.getText();
		System.out.println(text);
		
		Assert.assertEquals(text,"I am a JS Alert");
		
		//to accept alert
		alert.accept();
		//alert.dismiss();
		Thread.sleep(5000);
		
		//JS confirm alert
		$(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button")).click();
		Thread.sleep(5000);
		Alert alert1=switchTo().alert();
		
		String text1=alert1.getText();
		System.out.println(text1);
		
		Assert.assertEquals(text1,"I am a JS Confirm");
		
		//to accept alert
		alert.accept();
		
		//JS sendKeys alert
		$(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click();
		Thread.sleep(5000);
		Alert alert3=switchTo().alert();
		
		String text3=alert3.getText();
		System.out.println(text3);
		
		alert.sendKeys("Hello, I am here!!!");
		//Assert.assertEquals(text3,"I am a JS Confirm");
		
		//to accept alert
		alert.accept();
	}
}
