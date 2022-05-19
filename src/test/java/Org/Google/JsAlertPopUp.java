package Org.Google;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.open;
public class JsAlertPopUp {
	@Test
	public void alertPopup() throws InterruptedException {
		
		open("https://mail.rediff.com/cgi-bin/login.cgi");
		$(By.name("proceed")).click();
		Thread.sleep(5000);
		Alert alert=switchTo().alert();
		
		String text=alert.getText();
		System.out.println(text);
		
		Assert.assertEquals(text,"Please enter a valid user name");
		
		//to accept alert
		alert.accept();
		//alert.dismiss();appwiz
	}

}
