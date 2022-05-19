package Org.Google;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.*;

public class CloseBrowser {
  
	@Test
	public void closebrowsertest() {
		open("https://opensource-demo.orangehrmlive.com/");//parent
		System.out.println(title());
		
		$("img[alt='OrangeHRM on youtube']").click();//child
		
		switchTo().window(1);
		System.out.println(title());
		
		closeWindow();
		
		switchTo().window(0);
		System.out.println(title());
		
		closeWebDriver();
		
	}
}
