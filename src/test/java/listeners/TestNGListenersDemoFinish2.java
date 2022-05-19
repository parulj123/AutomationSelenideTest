package listeners;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listeners.TestNGListeners.class)
public class TestNGListenersDemoFinish2 {
	
	@Test
	public void test4() {
		System.out.println("I am Inside Test 4");
	}
	
	@Test
	public void test5() {
		System.out.println("I am Inside Test 5");
	}
	@Test
	public void test6() {
		System.out.println("I am Inside Test 6");
	}
}
